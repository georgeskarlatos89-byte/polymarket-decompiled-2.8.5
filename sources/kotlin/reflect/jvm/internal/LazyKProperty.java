package kotlin.reflect.jvm.internal;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.gla;
import defpackage.mka;
import defpackage.oka;
import defpackage.vka;
import defpackage.w4b;
import defpackage.wka;
import defpackage.yka;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001b\n\u0002\b\u0003\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00028\u00002\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00028\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001f\u001a\u00028\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0016\u00100\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00102R\u0014\u00104\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102R\u0014\u00105\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00102R\u0014\u00106\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00102R\u0014\u00107\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00102R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u0002080\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010$¨\u0006;"}, d2 = {"Lkotlin/reflect/jvm/internal/LazyKProperty;", "V", "Lvka;", "D", "Lkotlin/Function0;", "computeProperty", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lmka;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "delegate$delegate", "Lkotlin/Lazy;", "getDelegate", "()Lvka;", "delegate", "getName", Keys.KEY_NAME, "", "getParameters", "()Ljava/util/List;", "parameters", "Lwka;", "getReturnType", "()Lwka;", "returnType", "Lyka;", "getTypeParameters", "typeParameters", "Lgla;", "getVisibility", "()Lgla;", "visibility", "isFinal", "()Z", "isOpen", "isAbstract", "isSuspend", "isLateinit", "isConst", "", "getAnnotations", "annotations", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class LazyKProperty<V, D extends vka> implements vka {

    /* renamed from: delegate$delegate, reason: from kotlin metadata */
    private final Lazy delegate;

    public LazyKProperty(Function0<? extends D> function0) {
        function0.getClass();
        this.delegate = LazyKt.a(w4b.PUBLICATION, function0);
    }

    @Override // defpackage.lja
    public V call(Object... args) {
        args.getClass();
        return (V) getDelegate().call(Arrays.copyOf(args, args.length));
    }

    @Override // defpackage.lja
    public V callBy(Map<mka, ? extends Object> args) {
        args.getClass();
        return (V) getDelegate().callBy(args);
    }

    public boolean equals(Object other) {
        return Intrinsics.areEqual(getDelegate(), other);
    }

    @Override // defpackage.kja
    public List<Annotation> getAnnotations() {
        return getDelegate().getAnnotations();
    }

    public final D getDelegate() {
        return (D) this.delegate.getValue();
    }

    @Override // defpackage.vka
    public abstract /* synthetic */ oka getGetter();

    @Override // defpackage.lja
    public String getName() {
        return getDelegate().getName();
    }

    @Override // defpackage.lja
    public List<mka> getParameters() {
        return getDelegate().getParameters();
    }

    @Override // defpackage.lja
    public wka getReturnType() {
        return getDelegate().getReturnType();
    }

    @Override // defpackage.lja, kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl
    public List<yka> getTypeParameters() {
        return getDelegate().getTypeParameters();
    }

    @Override // defpackage.lja
    public gla getVisibility() {
        return getDelegate().getVisibility();
    }

    public int hashCode() {
        return getDelegate().hashCode();
    }

    @Override // defpackage.lja
    public boolean isAbstract() {
        return getDelegate().isAbstract();
    }

    @Override // defpackage.vka
    public boolean isConst() {
        return getDelegate().isConst();
    }

    @Override // defpackage.lja
    public boolean isFinal() {
        return getDelegate().isFinal();
    }

    @Override // defpackage.vka
    public boolean isLateinit() {
        return getDelegate().isLateinit();
    }

    @Override // defpackage.lja
    public boolean isOpen() {
        return getDelegate().isOpen();
    }

    @Override // defpackage.lja, defpackage.vja
    public boolean isSuspend() {
        return getDelegate().isSuspend();
    }

    public String toString() {
        return getDelegate().toString();
    }
}
