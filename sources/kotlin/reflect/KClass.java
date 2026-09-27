package kotlin.reflect;

import defpackage.kja;
import defpackage.tja;
import defpackage.uja;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/KClass;", "", "T", "Luja;", "Lkja;", "Ltja;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface KClass<T> extends uja, kja, tja {
    Collection getConstructors();

    Collection getMembers();

    Collection getNestedClasses();

    Object getObjectInstance();

    String getQualifiedName();

    String getSimpleName();

    List getSupertypes();

    List getTypeParameters();

    int hashCode();

    boolean isAbstract();

    boolean isCompanion();

    boolean isInner();

    boolean isInstance(Object obj);

    boolean isSealed();

    boolean isValue();
}
