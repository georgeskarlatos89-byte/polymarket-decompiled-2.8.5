package kotlin.reflect.jvm.internal;

import defpackage.gla;
import defpackage.mka;
import defpackage.wka;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.ReflectProperties;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016¢\u0006\u0002\u0010\u000bR,\u0010\u0005\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\b \t*\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectKCallableImpl;", "R", "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "<init>", "()V", "_absentArguments", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "getAbsentArguments", "()[Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ReflectKCallableImpl<R> implements ReflectKCallable<R> {
    private final ReflectProperties.LazySoftVal<Object[]> _absentArguments;

    public ReflectKCallableImpl() {
        ReflectProperties.LazySoftVal<Object[]> lazySoft = ReflectProperties.lazySoft(new ReflectKCallableImpl$_absentArguments$1(this));
        lazySoft.getClass();
        this._absentArguments = lazySoft;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public /* bridge */ R call(Object... objArr) {
        return default$call(objArr);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public /* bridge */ R callBy(Map<mka, ? extends Object> map) {
        return default$callBy(map);
    }

    public R default$call(Object... objArr) {
        objArr.getClass();
        try {
            return (R) getCaller().call(objArr);
        } catch (IllegalAccessException e) {
            throw new Exception(e);
        }
    }

    public R default$callBy(Map<mka, ? extends Object> map) {
        map.getClass();
        if (ReflectKCallableKt.isAnnotationConstructor(this)) {
            return (R) ReflectKCallableKt.callAnnotationConstructor(this, map);
        }
        return (R) ReflectKCallableKt.callDefaultMethod(this, map, null);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public Object[] getAbsentArguments() {
        return (Object[]) this._absentArguments.invoke().clone();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.kja
    public abstract /* synthetic */ List getAnnotations();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ String getName();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ List getParameters();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ wka getReturnType();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja, kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl
    public abstract /* synthetic */ List getTypeParameters();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ gla getVisibility();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ boolean isAbstract();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ boolean isFinal();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ boolean isOpen();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja, defpackage.vja
    public abstract /* synthetic */ boolean isSuspend();
}
