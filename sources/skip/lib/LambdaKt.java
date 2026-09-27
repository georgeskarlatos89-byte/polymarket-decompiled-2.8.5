package skip.lib;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000X\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003¢\u0006\u0002\u0010\u0004\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0006\u001a\u0002H\u00052\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00010\u0007¢\u0006\u0002\u0010\b\u001aG\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u00012\u0006\u0010\u0006\u001a\u0002H\u00052\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\u00010\u000b¢\u0006\u0002\u0010\f\u001a[\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00012\u0006\u0010\u0006\u001a\u0002H\u00052\u0006\u0010\n\u001a\u0002H\t2\u0006\u0010\u000e\u001a\u0002H\r2\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00010\u000f¢\u0006\u0002\u0010\u0010\u001ao\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0011\"\u0004\b\u0004\u0010\u00012\u0006\u0010\u0006\u001a\u0002H\u00052\u0006\u0010\n\u001a\u0002H\t2\u0006\u0010\u000e\u001a\u0002H\r2\u0006\u0010\u0012\u001a\u0002H\u00112$\u0010\u0002\u001a \u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u00010\u0013¢\u0006\u0002\u0010\u0014\u001a\u0083\u0001\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0011\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u00012\u0006\u0010\u0006\u001a\u0002H\u00052\u0006\u0010\n\u001a\u0002H\t2\u0006\u0010\u000e\u001a\u0002H\r2\u0006\u0010\u0012\u001a\u0002H\u00112\u0006\u0010\u0016\u001a\u0002H\u00152*\u0010\u0002\u001a&\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u00010\u0017¢\u0006\u0002\u0010\u0018\u001a\u0097\u0001\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0011\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0019\"\u0004\b\u0006\u0010\u00012\u0006\u0010\u0006\u001a\u0002H\u00052\u0006\u0010\n\u001a\u0002H\t2\u0006\u0010\u000e\u001a\u0002H\r2\u0006\u0010\u0012\u001a\u0002H\u00112\u0006\u0010\u0016\u001a\u0002H\u00152\u0006\u0010\u001a\u001a\u0002H\u001920\u0010\u0002\u001a,\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u00010\u001b¢\u0006\u0002\u0010\u001c\u001a«\u0001\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0011\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0019\"\u0004\b\u0006\u0010\u001d\"\u0004\b\u0007\u0010\u00012\u0006\u0010\u0006\u001a\u0002H\u00052\u0006\u0010\n\u001a\u0002H\t2\u0006\u0010\u000e\u001a\u0002H\r2\u0006\u0010\u0012\u001a\u0002H\u00112\u0006\u0010\u0016\u001a\u0002H\u00152\u0006\u0010\u001a\u001a\u0002H\u00192\u0006\u0010\u001e\u001a\u0002H\u001d26\u0010\u0002\u001a2\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H\u00010\u001f¢\u0006\u0002\u0010 \u001a¿\u0001\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0011\"\u0004\b\u0004\u0010\u0015\"\u0004\b\u0005\u0010\u0019\"\u0004\b\u0006\u0010\u001d\"\u0004\b\u0007\u0010!\"\u0004\b\b\u0010\u00012\u0006\u0010\u0006\u001a\u0002H\u00052\u0006\u0010\n\u001a\u0002H\t2\u0006\u0010\u000e\u001a\u0002H\r2\u0006\u0010\u0012\u001a\u0002H\u00112\u0006\u0010\u0016\u001a\u0002H\u00152\u0006\u0010\u001a\u001a\u0002H\u00192\u0006\u0010\u001e\u001a\u0002H\u001d2\u0006\u0010\"\u001a\u0002H!2<\u0010\u0002\u001a8\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u0002H\u0015\u0012\u0004\u0012\u0002H\u0019\u0012\u0004\u0012\u0002H\u001d\u0012\u0004\u0012\u0002H!\u0012\u0004\u0012\u0002H\u00010#¢\u0006\u0002\u0010$\u001a2\u0010%\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010&\u0012\u0006\u0012\u0004\u0018\u00010'0\u0007H\u0086@¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"linvoke", "R", "l", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "P0", "p0", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "P1", "p1", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "P2", "p2", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "P3", "p3", "Lkotlin/Function4;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "P4", "p4", "Lkotlin/Function5;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "P5", "p5", "Lkotlin/Function6;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function6;)Ljava/lang/Object;", "P6", "p6", "Lkotlin/Function7;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function7;)Ljava/lang/Object;", "P7", "p7", "Lkotlin/Function8;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function8;)Ljava/lang/Object;", "linvokeSuspend", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LambdaKt {
    public static final <P0, P1, P2, P3, P4, P5, P6, P7, R> R linvoke(P0 p0, P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, P7 p7, Function8<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> function8) {
        function8.getClass();
        return function8.invoke(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public static final <R> Object linvokeSuspend(Function1<? super Continuation<? super R>, ? extends Object> function1, Continuation<? super R> continuation) {
        return function1.invoke(continuation);
    }

    public static final <P0, R> R linvoke(P0 p0, Function1<? super P0, ? extends R> function1) {
        function1.getClass();
        return function1.invoke(p0);
    }

    public static final <P0, P1, R> R linvoke(P0 p0, P1 p1, Function2<? super P0, ? super P1, ? extends R> function2) {
        function2.getClass();
        return function2.invoke(p0, p1);
    }

    public static final <P0, P1, P2, R> R linvoke(P0 p0, P1 p1, P2 p2, Function3<? super P0, ? super P1, ? super P2, ? extends R> function3) {
        function3.getClass();
        return function3.invoke(p0, p1, p2);
    }

    public static final <P0, P1, P2, P3, R> R linvoke(P0 p0, P1 p1, P2 p2, P3 p3, Function4<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> function4) {
        function4.getClass();
        return function4.invoke(p0, p1, p2, p3);
    }

    public static final <P0, P1, P2, P3, P4, R> R linvoke(P0 p0, P1 p1, P2 p2, P3 p3, P4 p4, Function5<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> function5) {
        function5.getClass();
        return function5.invoke(p0, p1, p2, p3, p4);
    }

    public static final <P0, P1, P2, P3, P4, P5, R> R linvoke(P0 p0, P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, Function6<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> function6) {
        function6.getClass();
        return function6.invoke(p0, p1, p2, p3, p4, p5);
    }

    public static final <P0, P1, P2, P3, P4, P5, P6, R> R linvoke(P0 p0, P1 p1, P2 p2, P3 p3, P4 p4, P5 p5, P6 p6, Function7<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> function7) {
        function7.getClass();
        return function7.invoke(p0, p1, p2, p3, p4, p5, p6);
    }

    public static final <R> R linvoke(Function0<? extends R> function0) {
        function0.getClass();
        return function0.invoke();
    }
}
