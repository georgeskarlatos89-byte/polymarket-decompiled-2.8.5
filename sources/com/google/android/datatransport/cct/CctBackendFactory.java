package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.idj;
import defpackage.kd5;
import defpackage.pw0;
import defpackage.qa3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class CctBackendFactory {
    public idj create(kd5 kd5Var) {
        Context context = ((pw0) kd5Var).a;
        pw0 pw0Var = (pw0) kd5Var;
        return new qa3(context, pw0Var.b, pw0Var.c);
    }
}
