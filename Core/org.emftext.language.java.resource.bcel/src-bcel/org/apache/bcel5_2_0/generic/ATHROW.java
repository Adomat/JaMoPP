/*
 * Copyright  2000-2004 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); 
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 *
 */
package org.apache.bcel5_2_0.generic;

/** 
 * ATHROW -  Throw exception
 * <PRE>Stack: ..., objectref -&gt; objectref</PRE>
 *
 * @version $Id: ATHROW.java 386056 2006-03-15 11:31:56Z tcurdt $
 * @author  <A HREF="mailto:m.dahm@gmx.de">M. Dahm</A>
 */
public class ATHROW extends Instruction implements UnconditionalBranch, ExceptionThrower {

    /** 
     *  Throw exception
     */
    public ATHROW() {
        super(org.apache.bcel5_2_0.Constants.ATHROW, (short) 1);
    }


    /** @return exceptions this instruction may cause
     */
    public Class[] getExceptions() {
        return new Class[] {
            org.apache.bcel5_2_0.ExceptionConstants.THROWABLE
        };
    }


    /**
     * Call corresponding visitor method(s). The order is:
     * Call visitor methods of implemented interfaces first, then
     * call methods according to the class hierarchy in descending order,
     * i.e., the most specific visitXXX() call comes last.
     *
     * @param v Visitor object
     */
    public void accept( Visitor v ) {
        v.visitUnconditionalBranch(this);
        v.visitExceptionThrower(this);
        v.visitATHROW(this);
    }
}