package io.getstream.chat.android.network.models;

import com.appsflyer.AdRevenueScheme;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.hdi;
import defpackage.k84;
import defpackage.mda;
import defpackage.woa;
import defpackage.zca;
import io.radar.sdk.RadarTrackingOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJV\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/getstream/chat/android/network/models/AppResponseFields;", "", "", "asyncUrlEnrichEnabled", "autoTranslationEnabled", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, "", Keys.KEY_NAME, AdRevenueScheme.PLACEMENT, "Lio/getstream/chat/android/network/models/FileUploadConfig;", "fileUploadConfig", "imageUploadConfig", "<init>", "(ZZILjava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/network/models/FileUploadConfig;Lio/getstream/chat/android/network/models/FileUploadConfig;)V", "copy", "(ZZILjava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/network/models/FileUploadConfig;Lio/getstream/chat/android/network/models/FileUploadConfig;)Lio/getstream/chat/android/network/models/AppResponseFields;", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class AppResponseFields {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final String d;
    public final String e;
    public final FileUploadConfig f;
    public final FileUploadConfig g;

    public AppResponseFields(@zca(name = "async_url_enrich_enabled") boolean z, @zca(name = "auto_translation_enabled") boolean z2, @zca(name = "id") int i, @zca(name = "name") String str, @zca(name = "placement") String str2, @zca(name = "file_upload_config") FileUploadConfig fileUploadConfig, @zca(name = "image_upload_config") FileUploadConfig fileUploadConfig2) {
        str.getClass();
        str2.getClass();
        fileUploadConfig.getClass();
        fileUploadConfig2.getClass();
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = fileUploadConfig;
        this.g = fileUploadConfig2;
    }

    public final AppResponseFields copy(@zca(name = "async_url_enrich_enabled") boolean asyncUrlEnrichEnabled, @zca(name = "auto_translation_enabled") boolean autoTranslationEnabled, @zca(name = "id") int id, @zca(name = "name") String name, @zca(name = "placement") String placement, @zca(name = "file_upload_config") FileUploadConfig fileUploadConfig, @zca(name = "image_upload_config") FileUploadConfig imageUploadConfig) {
        name.getClass();
        placement.getClass();
        fileUploadConfig.getClass();
        imageUploadConfig.getClass();
        return new AppResponseFields(asyncUrlEnrichEnabled, autoTranslationEnabled, id, name, placement, fileUploadConfig, imageUploadConfig);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppResponseFields)) {
            return false;
        }
        AppResponseFields appResponseFields = (AppResponseFields) obj;
        if (this.a == appResponseFields.a && this.b == appResponseFields.b && this.c == appResponseFields.c && Intrinsics.areEqual(this.d, appResponseFields.d) && Intrinsics.areEqual(this.e, appResponseFields.e) && Intrinsics.areEqual(this.f, appResponseFields.f) && Intrinsics.areEqual(this.g, appResponseFields.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + hdi.e(hdi.e(woa.b(this.c, hdi.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder h = k84.h("AppResponseFields(asyncUrlEnrichEnabled=", ", autoTranslationEnabled=", ", id=", this.a, this.b);
        woa.u(this.c, ", name=", this.d, ", placement=", h);
        h.append(this.e);
        h.append(", fileUploadConfig=");
        h.append(this.f);
        h.append(", imageUploadConfig=");
        h.append(this.g);
        h.append(")");
        return h.toString();
    }
}
