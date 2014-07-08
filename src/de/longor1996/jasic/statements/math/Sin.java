package de.longor1996.jasic.statements.math;

import de.longor1996.jasic.Expression;
import de.longor1996.jasic.Jasic;
import de.longor1996.jasic.NumberValue;
import de.longor1996.jasic.Value;
import de.longor1996.jasic.statements.BasicMathStatement;

public class Sin extends BasicMathStatement
{
	public Sin(Jasic jasic, String output, Expression input) {
		super(jasic, output, input);
	}
	
	@Override public Value calc(Value evaluationResult) {
		return new NumberValue(Math.sin(evaluationResult.toNumber()));
	}
}