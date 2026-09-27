package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import defpackage.woa;
import defpackage.yfa;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDContextTypeAdapter.class)
/* loaded from: classes3.dex */
public final class LDContext implements yfa {
    static final String ATTR_ANONYMOUS = "anonymous";
    static final String ATTR_KEY = "key";
    static final String ATTR_KIND = "kind";
    static final String ATTR_NAME = "name";
    final boolean anonymous;
    final b attributes;
    final String error;
    final String fullyQualifiedKey;
    final String key;
    final d kind;
    final LDContext[] multiContexts;
    final String name;
    final List<AttributeRef> privateAttributes;

    public LDContext(d dVar, LDContext[] lDContextArr, String str, String str2, String str3, b bVar, boolean z, List list) {
        this.error = null;
        this.kind = dVar == null ? d.b : dVar;
        this.multiContexts = lDContextArr;
        this.key = str;
        this.fullyQualifiedKey = str2;
        this.name = str3;
        this.attributes = bVar;
        this.anonymous = z;
        this.privateAttributes = list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.launchdarkly.sdk.c] */
    public static c a(d dVar, String str) {
        ?? obj = new Object();
        obj.a = dVar;
        obj.b = str;
        return obj;
    }

    public static LDContext b(LDContext[] lDContextArr) {
        ArrayList<String> arrayList = null;
        boolean z = false;
        for (int i = 0; i < lDContextArr.length; i++) {
            LDContext lDContext = lDContextArr[i];
            if (!lDContext.q()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lDContext.error);
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        break;
                    }
                    if (Objects.equals(lDContextArr[i2].kind, lDContext.kind)) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
        }
        if (z) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add("multi-kind context cannot have same kind more than once");
        }
        if (arrayList != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(str);
            }
            return new LDContext(sb.toString());
        }
        Arrays.sort(lDContextArr, h.a);
        StringBuilder sb2 = new StringBuilder();
        for (LDContext lDContext2 : lDContextArr) {
            if (sb2.length() != 0) {
                sb2.append(':');
            }
            sb2.append(lDContext2.kind.a);
            sb2.append(':');
            sb2.append(lDContext2.key.replace("%", "%25").replace(":", "%3A"));
        }
        return new LDContext(d.c, lDContextArr, "", sb2.toString(), null, null, false, null);
    }

    public final Collection c() {
        Collection keySet;
        b bVar = this.attributes;
        if (bVar == null) {
            keySet = Collections.EMPTY_LIST;
        } else {
            keySet = bVar.a().keySet();
        }
        return keySet;
    }

    public final String d() {
        return this.error;
    }

    public final String e() {
        return this.fullyQualifiedKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LDContext)) {
            return false;
        }
        LDContext lDContext = (LDContext) obj;
        if (!Objects.equals(this.error, lDContext.error)) {
            return false;
        }
        if (this.error != null) {
            return true;
        }
        if (!Objects.equals(this.kind, lDContext.kind)) {
            return false;
        }
        if (p()) {
            if (this.multiContexts.length != lDContext.multiContexts.length) {
                return false;
            }
            int i = 0;
            while (true) {
                LDContext[] lDContextArr = this.multiContexts;
                if (i >= lDContextArr.length) {
                    return true;
                }
                if (!Objects.equals(lDContextArr[i], lDContext.multiContexts[i])) {
                    return false;
                }
                i++;
            }
        } else {
            if (!Objects.equals(this.key, lDContext.key) || !Objects.equals(this.name, lDContext.name) || this.anonymous != lDContext.anonymous || !Objects.equals(this.attributes, lDContext.attributes) || m() != lDContext.m()) {
                return false;
            }
            List<AttributeRef> list = this.privateAttributes;
            if (list != null) {
                for (AttributeRef attributeRef : list) {
                    Iterator<AttributeRef> it = lDContext.privateAttributes.iterator();
                    while (it.hasNext()) {
                        if (it.next().equals(attributeRef)) {
                            break;
                        }
                    }
                    return false;
                }
            }
            return true;
        }
    }

    public final LDContext f(int i) {
        LDContext[] lDContextArr = this.multiContexts;
        if (lDContextArr == null) {
            if (i != 0) {
                return null;
            }
            return this;
        }
        if (i < 0 || i >= lDContextArr.length) {
            return null;
        }
        return lDContextArr[i];
    }

    public final LDContext g(d dVar) {
        LDContext[] lDContextArr = this.multiContexts;
        if (lDContextArr == null) {
            if (dVar.equals(this.kind)) {
                return this;
            }
            return null;
        }
        for (LDContext lDContext : lDContextArr) {
            if (dVar.equals(lDContext.kind)) {
                return lDContext;
            }
        }
        return null;
    }

    public final int h() {
        if (this.error != null) {
            return 0;
        }
        LDContext[] lDContextArr = this.multiContexts;
        if (lDContextArr == null) {
            return 1;
        }
        return lDContextArr.length;
    }

    public final int hashCode() {
        int hash = Objects.hash(this.error, this.kind, this.key, this.name, Boolean.valueOf(this.anonymous));
        LDContext[] lDContextArr = this.multiContexts;
        if (lDContextArr != null) {
            for (LDContext lDContext : lDContextArr) {
                hash = (hash * 17) + lDContext.hashCode();
            }
        }
        b bVar = this.attributes;
        if (bVar != null) {
            hash = (hash * 17) + bVar.hashCode();
        }
        List<AttributeRef> list = this.privateAttributes;
        if (list != null) {
            AttributeRef[] attributeRefArr = (AttributeRef[]) list.toArray(new AttributeRef[list.size()]);
            Arrays.sort(attributeRefArr);
            for (AttributeRef attributeRef : attributeRefArr) {
                hash = (hash * 17) + attributeRef.hashCode();
            }
        }
        return hash;
    }

    public final String i() {
        return this.key;
    }

    public final d j() {
        return this.kind;
    }

    public final String k() {
        return this.name;
    }

    public final AttributeRef l(int i) {
        List<AttributeRef> list = this.privateAttributes;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.privateAttributes.get(i);
    }

    public final int m() {
        List<AttributeRef> list = this.privateAttributes;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if ((r0 instanceof com.launchdarkly.sdk.LDValueNull) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LDValue n(String str) {
        LDValue lDValue;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2095811475:
                if (str.equals(ATTR_ANONYMOUS)) {
                    c = 0;
                    break;
                }
                break;
            case 106079:
                if (str.equals(ATTR_KEY)) {
                    c = 1;
                    break;
                }
                break;
            case 3292052:
                if (str.equals(ATTR_KIND)) {
                    c = 2;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (this.anonymous) {
                    return LDValueBool.TRUE;
                }
                return LDValueBool.FALSE;
            case 1:
                if (this.multiContexts == null) {
                    return LDValue.n(this.key);
                }
                return LDValueNull.INSTANCE;
            case 2:
                return LDValue.n(this.kind.a);
            case 3:
                return LDValue.n(this.name);
            default:
                b bVar = this.attributes;
                if (bVar == null) {
                    return LDValueNull.INSTANCE;
                }
                while (true) {
                    if (bVar != null) {
                        lDValue = (LDValue) bVar.b.get(str);
                        if (lDValue != null) {
                            break;
                        } else {
                            bVar = bVar.a;
                        }
                    }
                }
                lDValue = null;
                if (lDValue == null) {
                    return LDValueNull.INSTANCE;
                }
                return lDValue;
        }
    }

    public final boolean o() {
        return this.anonymous;
    }

    public final boolean p() {
        if (this.multiContexts != null) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if (this.error == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        if (!q()) {
            return woa.r(new StringBuilder("(invalid LDContext: "), this.error, ")");
        }
        return zfa.a.toJson(this);
    }

    public LDContext(String str) {
        this.error = str;
        this.kind = null;
        this.multiContexts = null;
        this.key = "";
        this.fullyQualifiedKey = "";
        this.name = null;
        this.attributes = null;
        this.anonymous = false;
        this.privateAttributes = null;
    }
}
