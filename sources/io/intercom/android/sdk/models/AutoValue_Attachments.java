package io.intercom.android.sdk.models;

import defpackage.dmk;
import defpackage.woa;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
final class AutoValue_Attachments extends Attachments {
    private final String contentType;
    private final String humanFileSize;
    private final String name;
    private final String url;

    public AutoValue_Attachments(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.name = str;
            if (str2 != null) {
                this.url = str2;
                if (str3 != null) {
                    this.contentType = str3;
                    if (str4 != null) {
                        this.humanFileSize = str4;
                        return;
                    } else {
                        dmk.s("Null humanFileSize");
                        throw null;
                    }
                }
                dmk.s("Null contentType");
                throw null;
            }
            dmk.s("Null url");
            throw null;
        }
        dmk.s("Null name");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Attachments) {
            Attachments attachments = (Attachments) obj;
            if (this.name.equals(attachments.getName()) && this.url.equals(attachments.getUrl()) && this.contentType.equals(attachments.getContentType()) && this.humanFileSize.equals(attachments.getHumanFileSize())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Attachments
    public String getContentType() {
        return this.contentType;
    }

    @Override // io.intercom.android.sdk.models.Attachments
    public String getHumanFileSize() {
        return this.humanFileSize;
    }

    @Override // io.intercom.android.sdk.models.Attachments
    public String getName() {
        return this.name;
    }

    @Override // io.intercom.android.sdk.models.Attachments
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.humanFileSize.hashCode() ^ ((((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.contentType.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Attachments{name=");
        sb.append(this.name);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", humanFileSize=");
        return woa.r(sb, this.humanFileSize, "}");
    }
}
