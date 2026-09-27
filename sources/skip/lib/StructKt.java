package skip.lib;

import defpackage.a7c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u0002H\u00012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"sref", "T", "onUpdate", "Lkotlin/Function1;", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StructKt {
    public static /* synthetic */ Unit a(Object obj, Function1 function1) {
        return sref$lambda$0(function1, obj);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, skip.lib.MutableStruct] */
    public static final <T> T sref(T t, Function1<? super T, Unit> function1) {
        if (t instanceof MutableStruct) {
            ?? r2 = (T) ((MutableStruct) t).scopy();
            r2.setSupdate(new a7c(function1, 26));
            return r2;
        }
        return t;
    }

    public static /* synthetic */ Object sref$default(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return sref(obj, function1);
    }

    private static final Unit sref$lambda$0(Function1 function1, Object obj) {
        obj.getClass();
        if (function1 != null) {
            function1.invoke(obj);
        }
        return Unit.INSTANCE;
    }
}
