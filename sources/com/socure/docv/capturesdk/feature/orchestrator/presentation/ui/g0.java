package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import android.graphics.Bitmap;
import defpackage.k84;
import defpackage.m51;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class g0 {
    public final int a;
    public final u b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final String h;
    public final Bitmap i;
    public final boolean j;

    public g0(int i, u uVar, int i2, int i3, int i4, int i5, boolean z, String str, Bitmap bitmap, boolean z2) {
        this.a = i;
        this.b = uVar;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = z;
        this.h = str;
        this.i = bitmap;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g0) {
                g0 g0Var = (g0) obj;
                if (this.a != g0Var.a || !Intrinsics.areEqual(this.b, g0Var.b) || this.c != g0Var.c || this.d != g0Var.d || this.e != g0Var.e || this.f != g0Var.f || this.g != g0Var.g || !Intrinsics.areEqual(this.h, g0Var.h) || !Intrinsics.areEqual(this.i, g0Var.i) || this.j != g0Var.j) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int a = com.socure.docv.capturesdk.api.b.a(this.g, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.f, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.e, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.d, com.socure.docv.capturesdk.common.network.model.stepup.c.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), 31), 31), 31), 31);
        int i = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        Bitmap bitmap = this.i;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return Boolean.hashCode(this.j) + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileItemUiModel(index=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", textColor=");
        k84.i(this.c, this.d, ", subtitleColor=", ", cardBackgroundColor=", sb);
        k84.i(this.e, this.f, ", dividerColor=", ", showDelete=", sb);
        m51.y(", deleteTooltip=", this.h, ", thumbnailBitmap=", sb, this.g);
        sb.append(this.i);
        sb.append(", isLast=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
