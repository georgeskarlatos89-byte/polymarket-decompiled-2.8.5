package com.checkout.components.insight.data.dto;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.m51;
import defpackage.mda;
import defpackage.zca;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/insight/data/dto/Accessibility;", "", "", "largeText", "<init>", "(Z)V", "copy", "(Z)Lcom/checkout/components/insight/data/dto/Accessibility;", "a", "Z", "getLargeText", "()Z", "getLargeText$annotations", "()V", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes.dex */
public final /* data */ class Accessibility {

    /* renamed from: a, reason: from kotlin metadata */
    public final boolean largeText;

    public Accessibility(@zca(name = "large_text") boolean z) {
        this.largeText = z;
    }

    public final Accessibility copy(@zca(name = "large_text") boolean largeText) {
        return new Accessibility(largeText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Accessibility) && this.largeText == ((Accessibility) obj).largeText) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.largeText);
    }

    public final String toString() {
        return m51.l("Accessibility(largeText=", ")", this.largeText);
    }

    @zca(name = "large_text")
    public static /* synthetic */ void getLargeText$annotations() {
    }
}
