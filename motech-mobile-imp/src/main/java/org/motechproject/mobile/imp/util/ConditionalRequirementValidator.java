/**
 * MOTECH PLATFORM OPENSOURCE LICENSE AGREEMENT
 *
 * Copyright (c) 2010 The Trustees of Columbia University in the City of
 * New York and Grameen Foundation USA.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * 3. Neither the name of Grameen Foundation USA, Columbia University, or
 * their respective contributors may be used to endorse or promote products
 * derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY GRAMEEN FOUNDATION USA, COLUMBIA UNIVERSITY
 * AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL GRAMEEN FOUNDATION
 * USA, COLUMBIA UNIVERSITY OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA,
 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.motechproject.mobile.imp.util;

import java.util.Date;
import java.util.List;
import org.motechproject.mobile.core.manager.CoreManager;
import org.motechproject.mobile.core.model.IncMessageFormParameterStatus;
import org.motechproject.mobile.core.model.IncMessageFormStatus;
import org.motechproject.mobile.core.model.IncomingMessageForm;
import org.motechproject.mobile.core.model.IncomingMessageFormParameter;

/**
 * Validate an IncominMessageForm
 *
 * @author Kofi A. Asamoah (yoofi@dreamoval.com)
 *  Date : Sep 28, 2010
 */
public class ConditionalRequirementValidator {

    /**
     * Checks if a field exists in the form based on the value of another field
     *
     * @param form The form to validate
     * @param subFields A list containing information about the fields to validate {@link SubField}
     * @param coreManager Utility class for creating missing fields
     * @return
     */
    public boolean validate(IncomingMessageForm form, List<SubField> subFields, CoreManager coreManager) {
        boolean valid = true;

        for(SubField sf : subFields) {
            if(!form.getIncomingMsgFormParameters().containsKey(sf.getParentField().toLowerCase()))
                continue;
            
            IncomingMessageFormParameter parent = form.getIncomingMsgFormParameters().get(sf.getParentField().toLowerCase());

            if (sf.getReplaceOn().equals("*") || parent.getValue().equalsIgnoreCase(sf.getReplaceOn())) {

                if (!form.getIncomingMsgFormParameters().containsKey(sf.getFieldName().toLowerCase())) {
                    valid = false;
                    
                    IncomingMessageFormParameter param = coreManager.createIncomingMessageFormParameter();
                    param.setMessageFormParamStatus(IncMessageFormParameterStatus.INVALID);
                    param.setName(sf.getFieldName().toLowerCase());
                    param.setErrText("missing");
                    param.setValue("");
                    param.setErrCode(0);

                    form.getIncomingMsgFormParameters().put(sf.getFieldName().toLowerCase(), param);
                    form.setMessageFormStatus(IncMessageFormStatus.INVALID);
                    form.setLastModified(new Date());
                }
            }
        }
        return valid;
    }
}
