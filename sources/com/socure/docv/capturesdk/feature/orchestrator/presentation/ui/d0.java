package com.socure.docv.capturesdk.feature.orchestrator.presentation.ui;

import defpackage.ts6;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d0 extends ts6 {
    @Override // defpackage.ts6
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        return Intrinsics.areEqual((g0) obj, (g0) obj2);
    }

    @Override // defpackage.ts6
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        if (((g0) obj).a == ((g0) obj2).a) {
            return true;
        }
        return false;
    }
}
