package kotlin.reflect.jvm.internal;

import defpackage.cka;
import defpackage.fka;
import defpackage.gka;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0014\b\u0002\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/reflect/jvm/internal/LazyKMutableProperty1;", "T", "V", "Lgka;", "D", "Lkotlin/reflect/jvm/internal/LazyKProperty1;", "Lkotlin/Function0;", "computeProperty", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "receiver", "value", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lfka;", "getSetter", "()Lfka;", "setter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyKMutableProperty1<T, V, D extends gka> extends LazyKProperty1<T, V, D> implements gka {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyKMutableProperty1(Function0<? extends D> function0) {
        super(function0);
        function0.getClass();
    }

    @Override // defpackage.gka, defpackage.jka
    public fka getSetter() {
        return ((gka) getDelegate()).getSetter();
    }

    @Override // defpackage.gka
    public void set(T receiver, V value) {
        ((gka) getDelegate()).set(receiver, value);
    }

    @Override // defpackage.jka
    public /* bridge */ /* synthetic */ cka getSetter() {
        return getSetter();
    }
}
