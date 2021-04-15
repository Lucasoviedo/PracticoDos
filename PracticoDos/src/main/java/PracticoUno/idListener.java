// Generated from c:\Users\adm\Documents\TC\Proyectos\PracticoDos\PracticoDos\src\main\java\PracticoUno\id.g4 by ANTLR 4.8

    package PracticoUno;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link idParser}.
 */
public interface idListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link idParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(idParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(idParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(idParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(idParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(idParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(idParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link idParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(idParser.InstruccionContext ctx);
}