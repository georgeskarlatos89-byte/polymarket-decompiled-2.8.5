package com.google.android.libraries.places.internal;

import defpackage.dfa;
import defpackage.w4g;
import defpackage.x4g;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
final class zzna extends dfa {
    final /* synthetic */ Map zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzna(zzne zzneVar, int i, String str, JSONObject jSONObject, x4g x4gVar, w4g w4gVar, Map map) {
        super(str, null, x4gVar, w4gVar);
        this.zza = map;
        Objects.requireNonNull(zzneVar);
    }

    @Override // defpackage.m1g
    public final Map getHeaders() {
        return this.zza;
    }
}
