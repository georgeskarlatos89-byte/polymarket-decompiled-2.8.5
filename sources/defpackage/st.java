package defpackage;

import com.polymarket.clients.ClientChatMessage;
import io.sentry.e;
import io.sentry.util.network.d;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class st extends LinkedHashMap {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st(int i, float f, boolean z) {
        super(i, f, z);
        this.a = 1;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.containsKey((String) obj);
            case 1:
            default:
                return super.containsKey(obj);
            case 2:
                if (!(obj instanceof e)) {
                    return false;
                }
                return super.containsKey((e) obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ boolean containsValue(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof ClientChatMessage)) {
                    return false;
                }
                return super.containsValue((ClientChatMessage) obj);
            case 1:
            default:
                return super.containsValue(obj);
            case 2:
                if (!(obj instanceof d)) {
                    return false;
                }
                return super.containsValue((d) obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object get(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof String)) {
                    return null;
                }
                return (ClientChatMessage) super.get((String) obj);
            case 1:
            default:
                return super.get(obj);
            case 2:
                if (!(obj instanceof e)) {
                    return null;
                }
                return (d) super.get((e) obj);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return (ClientChatMessage) super.getOrDefault((String) obj, (ClientChatMessage) obj2);
                }
                return obj2;
            case 1:
            default:
                return super.getOrDefault(obj, obj2);
            case 2:
                if (obj instanceof e) {
                    return (d) super.getOrDefault((e) obj, (d) obj2);
                }
                return obj2;
        }
    }

    @Override // java.util.HashMap, java.util.Map
    public /* bridge */ boolean remove(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof String) || !(obj2 instanceof ClientChatMessage)) {
                    return false;
                }
                return super.remove((String) obj, (ClientChatMessage) obj2);
            case 1:
            default:
                return super.remove(obj, obj2);
            case 2:
                if (!(obj instanceof e) || !(obj2 instanceof d)) {
                    return false;
                }
                return super.remove((e) obj, (d) obj2);
        }
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.a) {
            case 0:
                if (super.size() > 500) {
                    return true;
                }
                return false;
            case 1:
                if (size() > 4) {
                    return true;
                }
                return false;
            default:
                if (super.size() > 32) {
                    return true;
                }
                return false;
        }
    }

    public /* synthetic */ st(int i) {
        this.a = i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* bridge */ Object remove(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof String) {
                    return (ClientChatMessage) super.remove((String) obj);
                }
                return null;
            case 1:
            default:
                return super.remove(obj);
            case 2:
                if (obj instanceof e) {
                    return (d) super.remove((e) obj);
                }
                return null;
        }
    }
}
