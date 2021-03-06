/*
 * Copyright 2014 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jbpm.kie.services.impl;

import org.kie.api.command.Command;
import org.kie.internal.command.ProcessInstanceIdCommand;

/**
 * This class is also used in the kie-remote-client module
 * 
 *
 */
public class CommonUtils {
	
	/**
	 * Returns the process instance id field in a command, if available
	 * </p>
	 * See the CommonUtils.testProcessInstanceIdCommands test in this module 
	 * 
	 * @param command The {@link Command} instance
	 * @return the process instance id, if it's available in this command
	 */
	public static Long getProcessInstanceId(Command<?> command) {
		if (command instanceof ProcessInstanceIdCommand) {
			return ((ProcessInstanceIdCommand) command).getProcessInstanceId();
		} 

        return null;
		
	}
}
