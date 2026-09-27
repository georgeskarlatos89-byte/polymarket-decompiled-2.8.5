package skip.lib;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a:\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\b¨\u0006\t"}, d2 = {"Result", "Lskip/lib/Result;", "Success", "Failure", "Lskip/lib/Error;", "catching", "Lkotlin/Function0;", "platformValue", "Lkotlin/Pair;", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ResultKt {
    public static final <Success, Failure extends Error> Result<Success, Failure> Result(Function0<? extends Success> function0) {
        function0.getClass();
        return Result.INSTANCE.init(function0);
    }

    public static final <Success, Failure extends Error> Result<Success, Failure> Result(Pair<? extends Success, ? extends Failure> pair) {
        pair.getClass();
        return Result.INSTANCE.init(pair);
    }
}
