/*******************************************************************************
 * QMetry Automation Framework provides a powerful and versatile platform to author 
 * Automated Test Cases in Behavior Driven, Keyword Driven or Code Driven approach
 *                
 * Copyright 2016 Infostretch Corporation
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT
 * OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE
 *
 * You should have received a copy of the GNU General Public License along with this program in the name of LICENSE.txt in the root folder of the distribution. If not, see https://opensource.org/licenses/gpl-3.0.html
 *
 * See the NOTICE.TXT file in root folder of this source files distribution 
 * for additional information regarding copyright ownership and licenses
 * of other open source software / files used by QMetry Automation Framework.
 *
 * For any inquiry or need additional information, please contact support-qaf@infostretch.com
 *******************************************************************************/


package com.williamssonoma.automationCore.exceptions;

import org.testng.SkipException;

/**
 * To indicate automation error,not an AUT failure so that the test case can be
 * in skip state instead of fail com.qmetry.qaf.automation.AutomationError.java
 * 
 * @author chirag
 */
public class AutomationError extends SkipException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2820870863950734300L;

	public AutomationError(String msg) {
		super(msg);
	}

	public AutomationError(String msg, Throwable cause) {
		super(msg, cause);
	}

	public AutomationError(Throwable cause) {
		this(cause.getMessage(), cause);
	}

	@Override
	public boolean isSkip() {
		return true;
	}
}
