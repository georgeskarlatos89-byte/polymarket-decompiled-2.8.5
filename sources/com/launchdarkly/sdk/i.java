package com.launchdarkly.sdk;

import com.google.gson.annotations.JsonAdapter;
import defpackage.pej;
import defpackage.pp8;
import defpackage.yfa;
import defpackage.zfa;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDUserTypeAdapter.class)
@Deprecated
/* loaded from: classes3.dex */
public final class i implements yfa {
    public final LDValue a;
    public final LDValue b;
    public final LDValue c;
    public final LDValue d;
    public final LDValue e;
    public final LDValue f;
    public final LDValue g;
    public final boolean h;
    public final LDValue i;
    public final Map j;
    public final Set k;

    public i(pej pejVar) {
        Map unmodifiableMap;
        this.a = LDValue.n((String) pejVar.b);
        this.b = LDValue.n((String) pejVar.d);
        this.i = LDValue.n((String) pejVar.j);
        this.f = LDValue.n((String) pejVar.e);
        this.g = LDValue.n((String) pejVar.f);
        this.c = LDValue.n((String) pejVar.g);
        this.d = LDValue.n((String) pejVar.h);
        this.e = LDValue.n((String) pejVar.i);
        this.h = pejVar.a;
        HashMap hashMap = (HashMap) pejVar.c;
        if (hashMap == null) {
            unmodifiableMap = null;
        } else {
            unmodifiableMap = Collections.unmodifiableMap(hashMap);
        }
        this.j = unmodifiableMap;
        LinkedHashSet linkedHashSet = (LinkedHashSet) pejVar.k;
        this.k = linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : null;
    }

    public final LDValue a(UserAttribute userAttribute) {
        pp8 pp8Var = userAttribute.b;
        if (pp8Var != null) {
            return (LDValue) pp8Var.f(this);
        }
        Map map = this.j;
        if (map == null) {
            return LDValueNull.INSTANCE;
        }
        LDValue lDValue = (LDValue) map.get(userAttribute);
        if (lDValue == null) {
            return LDValueNull.INSTANCE;
        }
        return lDValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (Objects.equals(this.a, iVar.a) && Objects.equals(this.b, iVar.b) && Objects.equals(this.c, iVar.c) && Objects.equals(this.d, iVar.d) && Objects.equals(this.e, iVar.e) && Objects.equals(this.f, iVar.f) && Objects.equals(this.g, iVar.g) && Objects.equals(this.i, iVar.i) && this.h == iVar.h && Objects.equals(this.j, iVar.j) && Objects.equals(this.k, iVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), this.i, this.j, this.k);
    }

    public final String toString() {
        return "LDUser(" + zfa.a.toJson(this) + ")";
    }
}
