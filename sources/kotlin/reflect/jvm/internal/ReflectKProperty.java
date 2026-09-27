package kotlin.reflect.jvm.internal;

import defpackage.gla;
import defpackage.oka;
import defpackage.usa;
import defpackage.vka;
import defpackage.wka;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectKProperty;", "V", "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "Lvka;", "Lusa;", "Ljava/lang/reflect/GenericDeclaration;", "findJavaDeclaration", "()Ljava/lang/reflect/GenericDeclaration;", "", "getSignature", "()Ljava/lang/String;", "signature", "Ljava/lang/reflect/Field;", "getJavaField", "()Ljava/lang/reflect/Field;", "javaField", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ReflectKProperty<V> extends usa, vka, ReflectKCallable<V> {
    @Override // defpackage.lja
    /* synthetic */ Object call(Object... objArr);

    @Override // defpackage.lja
    /* synthetic */ Object callBy(Map map);

    @Override // defpackage.usa
    /* synthetic */ GenericDeclaration findJavaDeclaration();

    @Override // defpackage.kja
    /* synthetic */ List getAnnotations();

    /* synthetic */ oka getGetter();

    Field getJavaField();

    @Override // defpackage.lja
    /* synthetic */ String getName();

    @Override // defpackage.lja
    /* synthetic */ List getParameters();

    @Override // defpackage.lja
    /* synthetic */ wka getReturnType();

    String getSignature();

    @Override // defpackage.lja, kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl
    /* synthetic */ List getTypeParameters();

    @Override // defpackage.lja
    /* synthetic */ gla getVisibility();

    @Override // defpackage.lja
    /* synthetic */ boolean isAbstract();

    /* synthetic */ boolean isConst();

    @Override // defpackage.lja
    /* synthetic */ boolean isFinal();

    /* synthetic */ boolean isLateinit();

    @Override // defpackage.lja
    /* synthetic */ boolean isOpen();

    @Override // defpackage.lja, defpackage.vja
    /* synthetic */ boolean isSuspend();
}
