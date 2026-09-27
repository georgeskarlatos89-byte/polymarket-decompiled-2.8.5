package skip.lib;

import defpackage.dmk;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.Error;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0010*\u0006\b\u0000\u0010\u0001 \u0001*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00032\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u00042\u00020\u0006:\u0003\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\t\u001a\u00028\u0000¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0016\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lskip/lib/Result;", "Success", "Failure", "Lskip/lib/Error;", "Lskip/lib/KotlinConverting;", "Lkotlin/Pair;", "Lskip/lib/SwiftCustomBridged;", "<init>", "()V", "get", "()Ljava/lang/Object;", "kotlin", "nocopy", "", "SuccessCase", "FailureCase", "Companion", "Lskip/lib/Result$FailureCase;", "Lskip/lib/Result$SuccessCase;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Result<Success, Failure extends Error> implements KotlinConverting<Pair<?, ?>>, SwiftCustomBridged {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0005\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lskip/lib/Result$FailureCase;", "Failure", "Lskip/lib/Error;", "Lskip/lib/Result;", "", "associated0", "<init>", "(Lskip/lib/Error;)V", "getAssociated0", "()Lskip/lib/Error;", "Lskip/lib/Error;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class FailureCase<Failure extends Error> extends Result {
        private final Failure associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailureCase(Failure failure) {
            super(null);
            failure.getClass();
            this.associated0 = failure;
        }

        public final Failure getAssociated0() {
            return this.associated0;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0004\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lskip/lib/Result$SuccessCase;", "Success", "Lskip/lib/Result;", "", "associated0", "<init>", "(Ljava/lang/Object;)V", "getAssociated0", "()Ljava/lang/Object;", "Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SuccessCase<Success> extends Result {
        private final Success associated0;

        public SuccessCase(Success success) {
            super(null);
            this.associated0 = success;
        }

        public final Success getAssociated0() {
            return this.associated0;
        }
    }

    public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Success get() {
        if (this instanceof SuccessCase) {
            return (Success) StructKt.sref$default(((SuccessCase) this).getAssociated0(), null, 1, null);
        }
        if (!(this instanceof FailureCase)) {
            dmk.a();
            return null;
        }
        Object associated0 = ((FailureCase) this).getAssociated0();
        associated0.getClass();
        throw ((Throwable) associated0);
    }

    @Override // skip.lib.KotlinConverting
    /* renamed from: kotlin, reason: avoid collision after fix types in other method */
    public Pair<?, ?> kotlin2(boolean nocopy) {
        if (this instanceof SuccessCase) {
            return new Pair<>(((SuccessCase) this).getAssociated0(), null);
        }
        if (this instanceof FailureCase) {
            return new Pair<>(null, ((FailureCase) this).getAssociated0());
        }
        dmk.a();
        return null;
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00070\u0005\"\u0004\b\u0002\u0010\u00062\u0006\u0010\b\u001a\u0002H\u0006¢\u0006\u0002\u0010\tJ)\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\u000b0\u0005\"\b\b\u0002\u0010\u000b*\u00020\f2\u0006\u0010\b\u001a\u0002H\u000b¢\u0006\u0002\u0010\rJ:\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u000b0\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u000b*\u00020\f2\u0016\u0010\u000f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u0006\u0012\u0006\u0012\u0004\u0018\u0001H\u000b0\u0010J0\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u000b0\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u000b*\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0012¨\u0006\u0013"}, d2 = {"Lskip/lib/Result$Companion;", "", "<init>", "()V", "success", "Lskip/lib/Result;", "Success", "", "associated0", "(Ljava/lang/Object;)Lskip/lib/Result;", "failure", "Failure", "Lskip/lib/Error;", "(Lskip/lib/Error;)Lskip/lib/Result;", "init", "platformValue", "Lkotlin/Pair;", "catching", "Lkotlin/Function0;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <Failure extends Error> Result failure(Failure associated0) {
            associated0.getClass();
            return new FailureCase(associated0);
        }

        public final <Success, Failure extends Error> Result<Success, Failure> init(Pair<? extends Success, ? extends Failure> platformValue) {
            platformValue.getClass();
            Failure second = platformValue.getSecond();
            if (second != null) {
                return Result.INSTANCE.failure(second);
            }
            Companion companion = Result.INSTANCE;
            Success first = platformValue.getFirst();
            first.getClass();
            return companion.success(first);
        }

        public final <Success> Result success(Success associated0) {
            return new SuccessCase(associated0);
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Success, Failure extends Error> Result<Success, Failure> init(Function0<? extends Success> catching) {
            catching.getClass();
            try {
                return Result.INSTANCE.success(catching.invoke());
            } catch (Throwable th) {
                Error aserror = ErrorKt.aserror(th);
                Companion companion = Result.INSTANCE;
                aserror.getClass();
                return companion.failure(aserror);
            }
        }
    }

    private Result() {
    }

    @Override // skip.lib.KotlinConverting
    public /* bridge */ /* synthetic */ Pair<?, ?> kotlin(boolean z) {
        return kotlin2(z);
    }
}
