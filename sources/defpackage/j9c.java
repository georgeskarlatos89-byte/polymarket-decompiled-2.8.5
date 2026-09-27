package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public interface j9c {
    default Map a() {
        i9c i9cVar;
        Object obj;
        if (this instanceof i9c) {
            i9cVar = (i9c) this;
        } else {
            i9cVar = null;
        }
        if (i9cVar != null) {
            obj = i9cVar.a.get("position");
        } else {
            obj = null;
        }
        if (!(obj instanceof Map)) {
            return null;
        }
        return (Map) obj;
    }
}
