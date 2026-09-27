package kotlin.reflect.jvm.internal;

import defpackage.oka;
import defpackage.rka;
import defpackage.ska;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0016\b\u0002\u0010\u0004 \u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/LazyKProperty1;", "T", "V", "Lska;", "D", "Lkotlin/reflect/jvm/internal/LazyKProperty;", "Lkotlin/Function0;", "computeProperty", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "invoke", "Lrka;", "getGetter", "()Lrka;", "getter", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public class LazyKProperty1<T, V, D extends ska> extends LazyKProperty<V, D> implements ska {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyKProperty1(Function0<? extends D> function0) {
        super(function0);
        function0.getClass();
    }

    @Override // defpackage.ska
    public V get(T receiver) {
        return (V) ((ska) getDelegate()).get(receiver);
    }

    @Override // defpackage.ska
    public Object getDelegate(T receiver) {
        return ((ska) getDelegate()).getDelegate(receiver);
    }

    @Override // kotlin.reflect.jvm.internal.LazyKProperty, defpackage.vka
    public rka getGetter() {
        return ((ska) getDelegate()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function1
    public V invoke(T receiver) {
        return (V) ((ska) getDelegate()).invoke(receiver);
    }

    @Override // kotlin.reflect.jvm.internal.LazyKProperty, defpackage.vka
    public /* bridge */ /* synthetic */ oka getGetter() {
        return getGetter();
    }
}
