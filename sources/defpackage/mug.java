package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class mug {
    public static final /* synthetic */ vka[] a = {new eqc(mug.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new eqc(mug.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new eqc(mug.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new eqc(mug.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new eqc(mug.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new eqc(mug.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new eqc(mug.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new eqc(mug.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new eqc(mug.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new eqc(mug.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new eqc(mug.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new eqc(mug.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new eqc(mug.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new eqc(mug.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new eqc(mug.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new eqc(mug.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new eqc(mug.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new eqc(mug.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new eqc(mug.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new eqc(mug.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new eqc(mug.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new eqc(mug.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new eqc(mug.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new eqc(mug.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new eqc(mug.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new eqc(mug.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new eqc(mug.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new eqc(mug.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new eqc(mug.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new eqc(mug.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new eqc(mug.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new eqc(mug.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        oug ougVar = kug.a;
        oug ougVar2 = xtg.a;
    }

    public static void a(pug pugVar, Function1 function1) {
        pugVar.a(xtg.a, new k6(null, function1));
    }

    public static void b(pug pugVar, Function1 function1) {
        pugVar.a(xtg.g, new k6(null, function1));
    }

    public static void c(pug pugVar, Function0 function0) {
        pugVar.a(xtg.b, new k6(null, function0));
    }

    public static void d(pug pugVar, Function1 function1) {
        pugVar.a(xtg.h, new k6(null, function1));
    }

    public static final void e(pug pugVar) {
        oug ougVar = kug.m;
        vka vkaVar = a[5];
        pugVar.a(ougVar, Boolean.TRUE);
    }

    public static final void f(pug pugVar, j10 j10Var) {
        oug ougVar = kug.s;
        vka vkaVar = a[9];
        pugVar.a(ougVar, j10Var);
    }

    public static final void g(String str, pug pugVar) {
        oug ougVar = kug.a;
        pugVar.a(kug.a, eb4.c(str));
    }

    public static final void h(pug pugVar, z45 z45Var) {
        oug ougVar = kug.a;
        oug ougVar2 = kug.r;
        vka vkaVar = a[8];
        pugVar.a(ougVar2, z45Var);
    }

    public static final void i(pug pugVar, int i) {
        oug ougVar = kug.k;
        vka vkaVar = a[3];
        pugVar.a(ougVar, new xmb(i));
    }

    public static final void j(String str, pug pugVar) {
        oug ougVar = kug.a;
        oug ougVar2 = kug.d;
        vka vkaVar = a[2];
        pugVar.a(ougVar2, str);
    }

    public static final void k(pug pugVar, y9f y9fVar) {
        oug ougVar = kug.a;
        oug ougVar2 = kug.c;
        vka vkaVar = a[1];
        pugVar.a(ougVar2, y9fVar);
    }

    public static final void l(pug pugVar, int i) {
        oug ougVar = kug.z;
        vka vkaVar = a[14];
        pugVar.a(ougVar, new u8g(i));
    }

    public static final void m(pug pugVar, boolean z) {
        oug ougVar = kug.a;
        oug ougVar2 = kug.J;
        vka vkaVar = a[23];
        pugVar.a(ougVar2, Boolean.valueOf(z));
    }

    public static final void n(pug pugVar, z0h z0hVar) {
        oug ougVar = kug.a;
        oug ougVar2 = kug.Q;
        vka vkaVar = a[30];
        pugVar.a(ougVar2, z0hVar);
    }

    public static final void o(String str, pug pugVar) {
        oug ougVar = kug.a;
        oug ougVar2 = kug.A;
        vka vkaVar = a[15];
        pugVar.a(ougVar2, str);
    }

    public static final void p(pug pugVar, gb0 gb0Var) {
        oug ougVar = kug.a;
        pugVar.a(kug.C, eb4.c(gb0Var));
    }

    public static final void q(pug pugVar, g4j g4jVar) {
        oug ougVar = kug.a;
        oug ougVar2 = kug.K;
        vka vkaVar = a[26];
        pugVar.a(ougVar2, g4jVar);
    }

    public static final void r(pug pugVar) {
        oug ougVar = kug.n;
        vka vkaVar = a[6];
        pugVar.a(ougVar, Boolean.TRUE);
    }

    public static final void s(pug pugVar, float f) {
        oug ougVar = kug.a;
        oug ougVar2 = kug.u;
        vka vkaVar = a[11];
        pugVar.a(ougVar2, Float.valueOf(f));
    }
}
