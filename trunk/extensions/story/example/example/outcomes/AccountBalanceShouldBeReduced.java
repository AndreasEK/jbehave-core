/*
 * Created on 27-Aug-2004
 * 
 * (c) 2003-2004 ThoughtWorks Ltd
 *
 * See license.txt for license details
 */
package example.outcomes;

import jbehave.core.Ensure;
import jbehave.story.domain.OutcomeUsingMiniMock;
import jbehave.story.domain.World;



/** balance = balance - 20 */
public class AccountBalanceShouldBeReduced extends OutcomeUsingMiniMock {

    public void setExpectationIn(World world) {
    }
    
    public void verify(World world) {
        Ensure.pending();
    }
}