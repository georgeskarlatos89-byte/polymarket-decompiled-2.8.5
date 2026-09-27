package io.intercom.android.sdk.models.carousel;

import defpackage.dmk;
import defpackage.woa;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
final class AutoValue_Appearance extends Appearance {
    private final String alignment;
    private final String textColor;
    private final String type;

    public AutoValue_Appearance(String str, String str2, String str3) {
        if (str != null) {
            this.type = str;
            if (str2 != null) {
                this.alignment = str2;
                if (str3 != null) {
                    this.textColor = str3;
                    return;
                } else {
                    dmk.s("Null textColor");
                    throw null;
                }
            }
            dmk.s("Null alignment");
            throw null;
        }
        dmk.s("Null type");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Appearance) {
            Appearance appearance = (Appearance) obj;
            if (this.type.equals(appearance.getType()) && this.alignment.equals(appearance.getAlignment()) && this.textColor.equals(appearance.getTextColor())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getAlignment() {
        return this.alignment;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getTextColor() {
        return this.textColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.textColor.hashCode() ^ ((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.alignment.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Appearance{type=");
        sb.append(this.type);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(", textColor=");
        return woa.r(sb, this.textColor, "}");
    }
}
