/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dreamoval.motech.imp.serivce;

/**
 * @author Kofi A. Asamoah (yoofi@dreamoval.com)
 *  Date : Dec 5, 2009
 */
public interface IMPService {

    /**
     * Processes an incoming message request
     * @param message the content of the request
     * @param requesterPhone the phone number through which the request was made
     * @return the response of the request
     */
    String processRequest(String message, String requesterPhone);

}