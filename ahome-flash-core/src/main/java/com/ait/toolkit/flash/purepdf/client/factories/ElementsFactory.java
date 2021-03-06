package com.ait.toolkit.flash.purepdf.client.factories;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.flash.core.client.framework.Bridge;
import com.ait.toolkit.flash.purepdf.client.elements.Chunk;
import com.ait.toolkit.flash.purepdf.client.elements.Paragraph;
import com.ait.toolkit.flash.purepdf.client.elements.Phrase;
import com.ait.toolkit.flash.purepdf.client.elements.Section;
import com.ait.toolkit.flash.purepdf.client.elements.images.ImageElement;
import com.ait.toolkit.flash.purepdf.client.fonts.Font;
import com.google.gwt.core.client.JavaScriptObject;

public class ElementsFactory extends JsObject {

    public static final ElementsFactory INSTANCE = new ElementsFactory();

    protected ElementsFactory( JavaScriptObject peer ) {
        this.jsObj = peer;
    }

    private ElementsFactory() {
        jsObj = Bridge.createObject( "com.ait.toolkit.flash.purepdf.factories.elements.ElementsFactory" );
    }

    public final native JavaScriptObject createRectangleElement( double llx, double lly, double urx, double ury )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createRectangleElement(llx, lly, urx, ury);
    }-*/;

    public final native JavaScriptObject createReadyOnlyRectangle( double llx, double lly, double urx, double ury )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createReadyOnlyRectangle(llx, lly, urx, ury);
    }-*/;

    public final native JavaScriptObject createParagraph( String text, Font font )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createParagraph(text,
				font.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createParagraph( String text )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createParagraph(text);
    }-*/;

    public final native JavaScriptObject createAnchor( String text, Font font )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createAnchor(text,
				font.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createAnchor( String text )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createAnchor(text);
    }-*/;

    public final native JavaScriptObject createPhrase( String text, Font font, int leading )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createPhrase(text,
				font.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				leading);
    }-*/;

    public final native JavaScriptObject createPhrase( String text, Font font )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createPhrase(text,
				font.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createPhrase( String text )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createPhrase(text);
    }-*/;

    public final native JavaScriptObject phraseFromChunk( Chunk value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.phraseFromChunk(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject anchorFromChunk( Chunk value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.anchorFromChunk(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject anchorFromPhrase( Phrase value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.anchorFromPhrase(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createNamedAnnotation( int value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createNamedAnnotation(value);
    }-*/;

    public final native JavaScriptObject createUrlAnnotation( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createUrlAnnotation(value);
    }-*/;

    public final native JavaScriptObject createStringAnnotation( String title, String content )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createStringAnnotation(title, content);
    }-*/;

    public final native JavaScriptObject createScreenAnnotation( String moviePath, String mimeType, boolean showOnDisplay )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createScreenAnnotation(moviePath, mimeType, showOnDisplay);
    }-*/;

    public final native JavaScriptObject createSection( Paragraph p, int depth )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createSection(
				p.@com.ait.toolkit.core.client.JsObject::getJsObj()(), depth);
    }-*/;

    public final native JavaScriptObject createChapter( Paragraph p, int number )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createChapter(
				p.@com.ait.toolkit.core.client.JsObject::getJsObj()(), number);
    }-*/;

    public final native JavaScriptObject createChapter( String p, int number )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createChapterFromString(p, number);
    }-*/;

    public final native JavaScriptObject createChapterAutoNumber( Paragraph p )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createChapterAutoNumber(p.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createChapterAutoNumber( String p )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createChapterAutoNumberFromString(p);
    }-*/;

    public final native JavaScriptObject createChunk( String content, Font font )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createChunk(content,
				font.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createChunk( String content )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createChunk(content);
    }-*/;

    public final native JavaScriptObject createChunkFromImage( ImageElement imageElement, double offsetX, double offsetY )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createChunkFromImage(
						imageElement.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						offsetX, offsetY);
    }-*/;

    public final native JavaScriptObject createHeaderFooter( Phrase before, Phrase after, boolean numbered )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createHeaderFooter(
				before.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				after.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				numbered);
    }-*/;

    public final native JavaScriptObject createHeaderFooter( Phrase before, Phrase after )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createHeaderFooter(
				before.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				after.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createHeaderFooter( Phrase before )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createHeaderFooter(before.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createList( boolean numbered, int symbolIndent )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createList(numbered, symbolIndent);
    }-*/;

    public final native JavaScriptObject createListItem( String text, Font font )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createListItem(text,
				font.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createListItem( String text )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createListItem(text);
    }-*/;

    public final native JavaScriptObject createListItemFromChunk( Chunk chunk )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createListItemFromChunk(chunk.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createListItemFromPhrase( Phrase phrase )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createListItemFromPhrase(phrase.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createMarkedSection( Section section )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createMarkedSection(section.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createMultiColumnText()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createMultiColumnText();
    }-*/;

    public final native JavaScriptObject createParagraphFromPhrase( Phrase value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createParagraphFromPhrase(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createParagraphFromChunk( Chunk value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.createParagraphFromChunk(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public final native JavaScriptObject createGreekList( int symbolIndent )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createGreekList(symbolIndent);
    }-*/;

    public final native JavaScriptObject createRomanList( int symbolIndent )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createRomanList(symbolIndent);
    }-*/;

}
