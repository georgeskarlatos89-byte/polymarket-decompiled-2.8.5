package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r49 extends t0c {
    public final /* synthetic */ int c;
    public final q49 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r49(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        super(kSerializer, kSerializer2);
        this.c = i;
        kSerializer.getClass();
        kSerializer2.getClass();
        switch (i) {
            case 1:
                super(kSerializer, kSerializer2);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
                descriptor.getClass();
                descriptor2.getClass();
                this.d = new q49("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                return;
            default:
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                SerialDescriptor descriptor4 = kSerializer2.getDescriptor();
                descriptor3.getClass();
                descriptor4.getClass();
                this.d = new q49("kotlin.collections.HashMap", descriptor3, descriptor4);
                return;
        }
    }

    @Override // defpackage.p1
    public final Object a() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.p1
    public final int b(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.p1
    public final Iterator c(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.entrySet().iterator();
        }
    }

    @Override // defpackage.p1
    public final int d(Object obj) {
        switch (this.c) {
            case 0:
                Map map = (Map) obj;
                map.getClass();
                return map.size();
            default:
                Map map2 = (Map) obj;
                map2.getClass();
                return map2.size();
        }
    }

    @Override // defpackage.p1
    public final Object g(Object obj) {
        switch (this.c) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        int i = this.c;
        return this.d;
    }

    @Override // defpackage.p1
    public final Object h(Object obj) {
        switch (this.c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                hashMap.getClass();
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                linkedHashMap.getClass();
                return linkedHashMap;
        }
    }
}
