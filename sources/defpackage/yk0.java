package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class yk0 extends xa4 {
    public final /* synthetic */ int b;
    public final fjb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk0(KSerializer kSerializer, int i) {
        super(kSerializer);
        this.b = i;
        kSerializer.getClass();
        switch (i) {
            case 1:
                super(kSerializer);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                descriptor.getClass();
                this.c = new sk0(descriptor, 2);
                return;
            case 2:
                super(kSerializer);
                SerialDescriptor descriptor2 = kSerializer.getDescriptor();
                descriptor2.getClass();
                this.c = new sk0(descriptor2, 3);
                return;
            default:
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                descriptor3.getClass();
                this.c = new sk0(descriptor3, 1);
                return;
        }
    }

    @Override // defpackage.p1
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.p1
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.p1
    public final Iterator c(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.p1
    public final int d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.p1
    public final Object g(Object obj) {
        switch (this.b) {
            case 0:
                throw null;
            case 1:
                throw null;
            default:
                throw null;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        int i = this.b;
        fjb fjbVar = this.c;
        switch (i) {
            case 0:
                return (sk0) fjbVar;
            case 1:
                return (sk0) fjbVar;
            default:
                return (sk0) fjbVar;
        }
    }

    @Override // defpackage.p1
    public final Object h(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // defpackage.xa4
    public final void i(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                return;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                return;
        }
    }
}
