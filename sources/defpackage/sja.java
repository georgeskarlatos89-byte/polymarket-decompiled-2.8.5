package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.DescriptorKCallable;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.ReflectKFunction;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class sja {
    public static final f3 a(KClass kClass) {
        kClass.getClass();
        List<yka> a = v33.a(kClass);
        ArrayList arrayList = new ArrayList(CollectionsKt.w(a));
        for (yka ykaVar : a) {
            arrayList.add(new KTypeProjection(u0n.c(ykaVar, null, 7), fla.INVARIANT));
        }
        return u0n.c(kClass, arrayList, 6);
    }

    public static final Object b(KClass kClass) {
        Object obj;
        kClass.getClass();
        Iterator it = kClass.getNestedClasses().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((KClass) obj).isCompanion()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        KClass kClass2 = (KClass) obj;
        if (kClass2 == null) {
            return null;
        }
        return kClass2.getObjectInstance();
    }

    public static final ArrayList c(KClass kClass) {
        boolean z;
        kClass.getClass();
        Collection<DescriptorKCallable<?>> allNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allNonStaticMembers) {
            DescriptorKCallable descriptorKCallable = (DescriptorKCallable) obj;
            if (descriptorKCallable.getDescriptor().D() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (descriptorKCallable instanceof vja)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList d(KClass kClass) {
        boolean z;
        kClass.getClass();
        Collection<DescriptorKCallable<?>> allNonStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllNonStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allNonStaticMembers) {
            DescriptorKCallable descriptorKCallable = (DescriptorKCallable) obj;
            if (descriptorKCallable.getDescriptor().D() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (descriptorKCallable instanceof ska)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final vja e(KClass kClass) {
        Object obj;
        kClass.getClass();
        Iterator it = kClass.getConstructors().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                vja vjaVar = (vja) obj;
                vjaVar.getClass();
                if (((ReflectKFunction) vjaVar).isPrimaryConstructor()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (vja) obj;
    }

    public static final ArrayList f(KClass kClass) {
        kClass.getClass();
        Collection<DescriptorKCallable<?>> allStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allStaticMembers) {
            if (obj instanceof vja) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList g(KClass kClass) {
        boolean z;
        kClass.getClass();
        Collection<DescriptorKCallable<?>> allStaticMembers = ((KClassImpl.Data) ((KClassImpl) kClass).getData().getValue()).getAllStaticMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allStaticMembers) {
            DescriptorKCallable descriptorKCallable = (DescriptorKCallable) obj;
            if (descriptorKCallable.getDescriptor().D() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (descriptorKCallable instanceof qka)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean h(KClass kClass, KClass kClass2) {
        kClass.getClass();
        kClass2.getClass();
        if (!Intrinsics.areEqual(kClass, kClass2)) {
            List c = eb4.c(kClass);
            rja rjaVar = rja.g;
            if (!xtn.e(c, new ma5(12), new q0(kClass2, 17)).booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }
}
