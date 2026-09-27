package kotlin.reflect.jvm.internal;

import defpackage.gla;
import defpackage.usa;
import defpackage.vja;
import defpackage.wka;
import java.lang.reflect.GenericDeclaration;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u00020\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectKFunction;", "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "", "Lvja;", "Lusa;", "Ljava/lang/reflect/GenericDeclaration;", "findJavaDeclaration", "()Ljava/lang/reflect/GenericDeclaration;", "", "getSignature", "()Ljava/lang/String;", "signature", "", "getOverridden", "()Ljava/util/Collection;", "overridden", "", "isPrimaryConstructor", "()Z", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ReflectKFunction extends usa, vja, ReflectKCallable<Object> {
    @Override // defpackage.lja
    /* synthetic */ Object call(Object... objArr);

    @Override // defpackage.lja
    /* synthetic */ Object callBy(Map map);

    @Override // defpackage.usa
    /* synthetic */ GenericDeclaration findJavaDeclaration();

    @Override // defpackage.kja
    /* synthetic */ List getAnnotations();

    @Override // defpackage.lja
    /* synthetic */ String getName();

    Collection<ReflectKFunction> getOverridden();

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

    /* synthetic */ boolean isExternal();

    @Override // defpackage.lja
    /* synthetic */ boolean isFinal();

    /* synthetic */ boolean isInfix();

    /* synthetic */ boolean isInline();

    @Override // defpackage.lja
    /* synthetic */ boolean isOpen();

    /* synthetic */ boolean isOperator();

    boolean isPrimaryConstructor();

    @Override // defpackage.vja
    /* synthetic */ boolean isSuspend();
}
