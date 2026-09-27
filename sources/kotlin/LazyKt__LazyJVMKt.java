package kotlin;

import defpackage.xhi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "lazy", "(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/LazyKt")
/* loaded from: classes6.dex */
public class LazyKt__LazyJVMKt {
    public static <T> Lazy<T> lazy(Function0<? extends T> function0) {
        function0.getClass();
        return new xhi(function0, null, 2, null);
    }
}
