/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dreamoval.motech.core.model.dao.hibernate.util;

import org.hibernate.Session;



/**
 *
 * @author Jojo
 */
public interface ISessionManager {

   public Session RequestSession();

}