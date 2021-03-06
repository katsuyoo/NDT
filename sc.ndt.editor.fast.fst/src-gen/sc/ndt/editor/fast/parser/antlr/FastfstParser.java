/*
* generated by Xtext
*/
package sc.ndt.editor.fast.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import sc.ndt.editor.fast.services.FastfstGrammarAccess;

public class FastfstParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FastfstGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens();
	}
	
	@Override
	protected sc.ndt.editor.fast.parser.antlr.internal.InternalFastfstParser createParser(XtextTokenStream stream) {
		return new sc.ndt.editor.fast.parser.antlr.internal.InternalFastfstParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ModelFastfst";
	}
	
	public FastfstGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FastfstGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
