package kotlin.reflect.jvm.internal;

import defpackage.gla;
import defpackage.ric;
import defpackage.wka;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/jvm/internal/KotlinKCallable;", "R", "Lkotlin/reflect/jvm/internal/ReflectKCallableImpl;", "<init>", "()V", "", "isFinal", "()Z", "isOpen", "isAbstract", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "Lric;", "getModality", "()Lkotlin/metadata/Modality;", "modality", "", "getRawBoundReceiver", "()Ljava/lang/Object;", "rawBoundReceiver", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class KotlinKCallable<R> extends ReflectKCallableImpl<R> {
    @Override // kotlin.reflect.jvm.internal.ReflectKCallableImpl, kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.kja
    public abstract /* synthetic */ List getAnnotations();

    public abstract ric getModality();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallableImpl, kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ String getName();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallableImpl, kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ List getParameters();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallableImpl, kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ wka getReturnType();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallableImpl, kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja, kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl
    public abstract /* synthetic */ List getTypeParameters();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallableImpl, kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public abstract /* synthetic */ gla getVisibility();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallableImpl, kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public final boolean isAbstract() {
        if (getModality() == ric.ABSTRACT) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallableImpl, kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public final boolean isFinal() {
        if (getModality() == ric.FINAL) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallableImpl, kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja
    public final boolean isOpen() {
        if (getModality() == ric.OPEN) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallableImpl, kotlin.reflect.jvm.internal.ReflectKCallable, defpackage.lja, defpackage.vja
    public abstract /* synthetic */ boolean isSuspend();
}
