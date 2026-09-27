package com.launchdarkly.sdk.android;

import com.google.gson.annotations.JsonAdapter;
import defpackage.sua;
import defpackage.tva;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@JsonAdapter(LDFailureSerialization.class)
/* loaded from: classes3.dex */
public class LDFailure extends tva {
    private final sua failureType;

    public LDFailure(String str, sua suaVar) {
        super(str);
        this.failureType = suaVar;
    }

    public final sua a() {
        return this.failureType;
    }

    public LDFailure(String str, Exception exc, sua suaVar) {
        super(str, exc);
        this.failureType = suaVar;
    }
}
