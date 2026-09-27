package kotlin.reflect.jvm.internal;

import defpackage.cka;
import defpackage.dka;
import defpackage.eka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/LazyKMutableProperty0;", "V", "Leka;", "D", "Lkotlin/reflect/jvm/internal/LazyKProperty0;", "Lkotlin/Function0;", "computeProperty", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "value", "", "set", "(Ljava/lang/Object;)V", "Ldka;", "getSetter", "()Ldka;", "setter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyKMutableProperty0<V, D extends eka> extends LazyKProperty0<V, D> implements eka {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyKMutableProperty0(Function0<? extends D> function0) {
        super(function0);
        function0.getClass();
    }

    @Override // defpackage.eka, defpackage.jka
    public dka getSetter() {
        return ((eka) getDelegate()).getSetter();
    }

    @Override // defpackage.eka
    public void set(V value) {
        ((eka) getDelegate()).set(value);
    }

    @Override // defpackage.jka
    public /* bridge */ /* synthetic */ cka getSetter() {
        return getSetter();
    }
}
