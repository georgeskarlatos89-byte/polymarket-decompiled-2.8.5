package defpackage;

import java.io.Serializable;
import java.util.Collections;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class ss8 extends h4 implements Serializable {
    public static os8 g(ndc ndcVar, ndc ndcVar2, int i, jnk jnkVar, Class cls) {
        return new os8(ndcVar, Collections.EMPTY_LIST, ndcVar2, new ns8(i, jnkVar, true), cls);
    }

    public static os8 h(ndc ndcVar, Object obj, ndc ndcVar2, int i, jnk jnkVar, Class cls) {
        return new os8(ndcVar, obj, ndcVar2, new ns8(i, jnkVar, false), cls);
    }
}
