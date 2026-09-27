package io.getstream.chat.android.models;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.ace;
import defpackage.sh7;
import defpackage.woa;
import defpackage.zc7;
import io.radar.sdk.RadarTrackingOptions;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.a;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002WXBÿ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u00109\u001a\u00020\u0003H\u0016J\f\u0010:\u001a\u00020\u0003*\u00020\u0003H\u0002J\b\u0010;\u001a\u00020<H\u0007J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010E\u001a\u00020\fHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010N\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u0015\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0003J\u0086\u0002\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aHÆ\u0001¢\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010V\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u00101\u001a\u0004\b2\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006Y"}, d2 = {"Lio/getstream/chat/android/models/Attachment;", "Lio/getstream/chat/android/models/CustomObject;", "authorName", "", "authorLink", "titleLink", "thumbUrl", "imageUrl", "assetUrl", "ogUrl", "mimeType", "fileSize", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "text", "type", "image", Keys.KEY_NAME, "fallback", "originalHeight", "originalWidth", "upload", "Ljava/io/File;", "uploadState", "Lio/getstream/chat/android/models/Attachment$UploadState;", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;)V", "getAuthorName", "()Ljava/lang/String;", "getAuthorLink", "getTitleLink", "getThumbUrl", "getImageUrl", "getAssetUrl", "getOgUrl", "getMimeType", "getFileSize", "()I", "getTitle", "getText", "getType", "getImage", "getName", "getFallback", "getOriginalHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOriginalWidth", "getUpload", "()Ljava/io/File;", "getUploadState", "()Lio/getstream/chat/android/models/Attachment$UploadState;", "getExtraData", "()Ljava/util/Map;", "toString", "shorten", "newBuilder", "Lio/getstream/chat/android/models/Attachment$Builder;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;)Lio/getstream/chat/android/models/Attachment;", "equals", "", "other", "hashCode", "UploadState", "Builder", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Attachment implements CustomObject {
    private final String assetUrl;
    private final String authorLink;
    private final String authorName;
    private final Map<String, Object> extraData;
    private final String fallback;
    private final int fileSize;
    private final String image;
    private final String imageUrl;
    private final String mimeType;
    private final String name;
    private final String ogUrl;
    private final Integer originalHeight;
    private final Integer originalWidth;
    private final String text;
    private final String thumbUrl;
    private final String title;
    private final String titleLink;
    private final String type;
    private final File upload;
    private final UploadState uploadState;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Attachment(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Integer num2, File file, UploadState uploadState, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r2, r16, r17, r18, r19, r42);
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        int i3;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        Integer num3;
        Integer num4;
        File file2;
        UploadState uploadState2;
        Map map2;
        if ((i2 & 1) != 0) {
            str15 = null;
        } else {
            str15 = str;
        }
        if ((i2 & 2) != 0) {
            str16 = null;
        } else {
            str16 = str2;
        }
        if ((i2 & 4) != 0) {
            str17 = null;
        } else {
            str17 = str3;
        }
        if ((i2 & 8) != 0) {
            str18 = null;
        } else {
            str18 = str4;
        }
        if ((i2 & 16) != 0) {
            str19 = null;
        } else {
            str19 = str5;
        }
        if ((i2 & 32) != 0) {
            str20 = null;
        } else {
            str20 = str6;
        }
        if ((i2 & 64) != 0) {
            str21 = null;
        } else {
            str21 = str7;
        }
        if ((i2 & 128) != 0) {
            str22 = null;
        } else {
            str22 = str8;
        }
        if ((i2 & 256) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & Barcode.FORMAT_UPC_A) != 0) {
            str23 = null;
        } else {
            str23 = str9;
        }
        if ((i2 & Barcode.FORMAT_UPC_E) != 0) {
            str24 = null;
        } else {
            str24 = str10;
        }
        if ((i2 & 2048) != 0) {
            str25 = null;
        } else {
            str25 = str11;
        }
        if ((i2 & 4096) != 0) {
            str26 = null;
        } else {
            str26 = str12;
        }
        if ((i2 & 8192) != 0) {
            str27 = null;
        } else {
            str27 = str13;
        }
        if ((i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str28 = null;
        } else {
            str28 = str14;
        }
        if ((i2 & 32768) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i2 & 65536) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i2 & 131072) != 0) {
            file2 = null;
        } else {
            file2 = file;
        }
        if ((i2 & 262144) != 0) {
            uploadState2 = null;
        } else {
            uploadState2 = uploadState;
        }
        if ((i2 & 524288) != 0) {
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            map2 = zc7Var;
        } else {
            map2 = map;
        }
    }

    public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Integer num2, File file, UploadState uploadState, Map map, int i2, Object obj) {
        Map map2;
        UploadState uploadState2;
        String str15 = (i2 & 1) != 0 ? attachment.authorName : str;
        String str16 = (i2 & 2) != 0 ? attachment.authorLink : str2;
        String str17 = (i2 & 4) != 0 ? attachment.titleLink : str3;
        String str18 = (i2 & 8) != 0 ? attachment.thumbUrl : str4;
        String str19 = (i2 & 16) != 0 ? attachment.imageUrl : str5;
        String str20 = (i2 & 32) != 0 ? attachment.assetUrl : str6;
        String str21 = (i2 & 64) != 0 ? attachment.ogUrl : str7;
        String str22 = (i2 & 128) != 0 ? attachment.mimeType : str8;
        int i3 = (i2 & 256) != 0 ? attachment.fileSize : i;
        String str23 = (i2 & Barcode.FORMAT_UPC_A) != 0 ? attachment.title : str9;
        String str24 = (i2 & Barcode.FORMAT_UPC_E) != 0 ? attachment.text : str10;
        String str25 = (i2 & 2048) != 0 ? attachment.type : str11;
        String str26 = (i2 & 4096) != 0 ? attachment.image : str12;
        String str27 = (i2 & 8192) != 0 ? attachment.name : str13;
        String str28 = str15;
        String str29 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? attachment.fallback : str14;
        Integer num3 = (i2 & 32768) != 0 ? attachment.originalHeight : num;
        Integer num4 = (i2 & 65536) != 0 ? attachment.originalWidth : num2;
        File file2 = (i2 & 131072) != 0 ? attachment.upload : file;
        UploadState uploadState3 = (i2 & 262144) != 0 ? attachment.uploadState : uploadState;
        if ((i2 & 524288) != 0) {
            uploadState2 = uploadState3;
            map2 = attachment.extraData;
        } else {
            map2 = map;
            uploadState2 = uploadState3;
        }
        return attachment.copy(str28, str16, str17, str18, str19, str20, str21, str22, i3, str23, str24, str25, str26, str27, str29, num3, num4, file2, uploadState2, map2);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.ranges.a, kotlin.ranges.IntRange] */
    private final String shorten(String str) {
        if (str.length() <= 9) {
            return str;
        }
        return StringsKt.h0(str, new a(0, 9, 1)).concat("...");
    }

    /* renamed from: component1, reason: from getter */
    public final String getAuthorName() {
        return this.authorName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component11, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component12, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component13, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component14, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component15, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getOriginalHeight() {
        return this.originalHeight;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getOriginalWidth() {
        return this.originalWidth;
    }

    /* renamed from: component18, reason: from getter */
    public final File getUpload() {
        return this.upload;
    }

    /* renamed from: component19, reason: from getter */
    public final UploadState getUploadState() {
        return this.uploadState;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAuthorLink() {
        return this.authorLink;
    }

    public final Map<String, Object> component20() {
        return this.extraData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitleLink() {
        return this.titleLink;
    }

    /* renamed from: component4, reason: from getter */
    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOgUrl() {
        return this.ogUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component9, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    public final Attachment copy(String authorName, String authorLink, String titleLink, String thumbUrl, String imageUrl, String assetUrl, String ogUrl, String mimeType, int fileSize, String title, String text, String type, String image, String name, String fallback, Integer originalHeight, Integer originalWidth, File upload, UploadState uploadState, Map<String, ? extends Object> extraData) {
        extraData.getClass();
        return new Attachment(authorName, authorLink, titleLink, thumbUrl, imageUrl, assetUrl, ogUrl, mimeType, fileSize, title, text, type, image, name, fallback, originalHeight, originalWidth, upload, uploadState, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Attachment)) {
            return false;
        }
        Attachment attachment = (Attachment) other;
        if (Intrinsics.areEqual(this.authorName, attachment.authorName) && Intrinsics.areEqual(this.authorLink, attachment.authorLink) && Intrinsics.areEqual(this.titleLink, attachment.titleLink) && Intrinsics.areEqual(this.thumbUrl, attachment.thumbUrl) && Intrinsics.areEqual(this.imageUrl, attachment.imageUrl) && Intrinsics.areEqual(this.assetUrl, attachment.assetUrl) && Intrinsics.areEqual(this.ogUrl, attachment.ogUrl) && Intrinsics.areEqual(this.mimeType, attachment.mimeType) && this.fileSize == attachment.fileSize && Intrinsics.areEqual(this.title, attachment.title) && Intrinsics.areEqual(this.text, attachment.text) && Intrinsics.areEqual(this.type, attachment.type) && Intrinsics.areEqual(this.image, attachment.image) && Intrinsics.areEqual(this.name, attachment.name) && Intrinsics.areEqual(this.fallback, attachment.fallback) && Intrinsics.areEqual(this.originalHeight, attachment.originalHeight) && Intrinsics.areEqual(this.originalWidth, attachment.originalWidth) && Intrinsics.areEqual(this.upload, attachment.upload) && Intrinsics.areEqual(this.uploadState, attachment.uploadState) && Intrinsics.areEqual(this.extraData, attachment.extraData)) {
            return true;
        }
        return false;
    }

    public final String getAssetUrl() {
        return this.assetUrl;
    }

    public final String getAuthorLink() {
        return this.authorLink;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public Map<String, Object> getExtraData() {
        return this.extraData;
    }

    @Override // io.getstream.chat.android.models.CustomObject
    public <T> T getExtraValue(String str, T t) {
        return (T) super.getExtraValue(str, t);
    }

    public final String getFallback() {
        return this.fallback;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOgUrl() {
        return this.ogUrl;
    }

    public final Integer getOriginalHeight() {
        return this.originalHeight;
    }

    public final Integer getOriginalWidth() {
        return this.originalWidth;
    }

    public final String getText() {
        return this.text;
    }

    public final String getThumbUrl() {
        return this.thumbUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleLink() {
        return this.titleLink;
    }

    public final String getType() {
        return this.type;
    }

    public final File getUpload() {
        return this.upload;
    }

    public final UploadState getUploadState() {
        return this.uploadState;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        String str = this.authorName;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.authorLink;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.titleLink;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.thumbUrl;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.imageUrl;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.assetUrl;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.ogUrl;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str8 = this.mimeType;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int b = woa.b(this.fileSize, (i8 + hashCode8) * 31, 31);
        String str9 = this.title;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i9 = (b + hashCode9) * 31;
        String str10 = this.text;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        String str11 = this.type;
        if (str11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str11.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        String str12 = this.image;
        if (str12 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str12.hashCode();
        }
        int i12 = (i11 + hashCode12) * 31;
        String str13 = this.name;
        if (str13 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str13.hashCode();
        }
        int i13 = (i12 + hashCode13) * 31;
        String str14 = this.fallback;
        if (str14 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str14.hashCode();
        }
        int i14 = (i13 + hashCode14) * 31;
        Integer num = this.originalHeight;
        if (num == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num.hashCode();
        }
        int i15 = (i14 + hashCode15) * 31;
        Integer num2 = this.originalWidth;
        if (num2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num2.hashCode();
        }
        int i16 = (i15 + hashCode16) * 31;
        File file = this.upload;
        if (file == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = file.hashCode();
        }
        int i17 = (i16 + hashCode17) * 31;
        UploadState uploadState = this.uploadState;
        if (uploadState != null) {
            i = uploadState.hashCode();
        }
        return this.extraData.hashCode() + ((i17 + i) * 31);
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Attachment(mimeType=\"");
        sb.append(this.mimeType);
        sb.append("\"");
        if (this.authorName != null) {
            sb.append(", authorName=");
            sb.append(this.authorName);
        }
        if (this.authorLink != null) {
            sb.append(", authorLink=");
            sb.append(this.authorLink);
        }
        if (this.titleLink != null) {
            sb.append(", titleLink=");
            sb.append(this.titleLink);
        }
        if (this.thumbUrl != null) {
            sb.append(", thumbUrl=");
            sb.append(shorten(this.thumbUrl));
        }
        if (this.imageUrl != null) {
            sb.append(", imageUrl=");
            sb.append(shorten(this.imageUrl));
        }
        if (this.assetUrl != null) {
            sb.append(", assetUrl=");
            sb.append(shorten(this.assetUrl));
        }
        if (this.ogUrl != null) {
            sb.append(", ogUrl=");
            sb.append(this.ogUrl.hashCode());
        }
        if (this.fileSize > 0) {
            sb.append(", fileSize=");
            sb.append(this.fileSize);
        }
        if (this.title != null) {
            sb.append(", title=\"");
            sb.append(this.title);
            sb.append("\"");
        }
        if (this.text != null) {
            sb.append(", text=\"");
            sb.append(this.text);
            sb.append("\"");
        }
        if (this.type != null) {
            sb.append(", type=\"");
            sb.append(this.type);
            sb.append("\"");
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.fallback != null) {
            sb.append(", fallback=");
            sb.append(this.fallback);
        }
        if (this.originalHeight != null) {
            sb.append(", origH=");
            sb.append(this.originalHeight.intValue());
        }
        if (this.originalWidth != null) {
            sb.append(", origW=");
            sb.append(this.originalWidth.intValue());
        }
        if (this.upload != null) {
            sb.append(", upload=\"");
            sb.append(this.upload);
            sb.append("\"");
        }
        if (this.uploadState != null) {
            sb.append(", uploadState=");
            sb.append(this.uploadState);
        }
        if (!getExtraData().isEmpty()) {
            sb.append(", extraData=");
            sb.append(getExtraData());
        }
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/getstream/chat/android/models/Attachment$UploadState;", "", "<init>", "()V", "Idle", "InProgress", "Success", "Failed", "Lio/getstream/chat/android/models/Attachment$UploadState$Failed;", "Lio/getstream/chat/android/models/Attachment$UploadState$Idle;", "Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;", "Lio/getstream/chat/android/models/Attachment$UploadState$Success;", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static abstract class UploadState {

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lio/getstream/chat/android/models/Attachment$UploadState$Failed;", "Lio/getstream/chat/android/models/Attachment$UploadState;", "Lsh7;", "error", "<init>", "(Lsh7;)V", "component1", "()Lsh7;", "copy", "(Lsh7;)Lio/getstream/chat/android/models/Attachment$UploadState$Failed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lsh7;", "getError", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final /* data */ class Failed extends UploadState {
            private final sh7 error;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(sh7 sh7Var) {
                super(null);
                sh7Var.getClass();
                this.error = sh7Var;
            }

            public static /* synthetic */ Failed copy$default(Failed failed, sh7 sh7Var, int i, Object obj) {
                if ((i & 1) != 0) {
                    sh7Var = failed.error;
                }
                return failed.copy(sh7Var);
            }

            /* renamed from: component1, reason: from getter */
            public final sh7 getError() {
                return this.error;
            }

            public final Failed copy(sh7 error) {
                error.getClass();
                return new Failed(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if ((other instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) other).error)) {
                    return true;
                }
                return false;
            }

            public final sh7 getError() {
                return this.error;
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Failed(error=" + this.error + ")";
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lio/getstream/chat/android/models/Attachment$UploadState$Idle;", "Lio/getstream/chat/android/models/Attachment$UploadState;", "<init>", "()V", "toString", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Idle extends UploadState {
            public static final Idle INSTANCE = new Idle();

            private Idle() {
                super(null);
            }

            public String toString() {
                return "Idle";
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;", "Lio/getstream/chat/android/models/Attachment$UploadState;", "bytesUploaded", "", "totalBytes", "<init>", "(JJ)V", "getBytesUploaded", "()J", "getTotalBytes", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final /* data */ class InProgress extends UploadState {
            private final long bytesUploaded;
            private final long totalBytes;

            public InProgress(long j, long j2) {
                super(null);
                this.bytesUploaded = j;
                this.totalBytes = j2;
            }

            public static /* synthetic */ InProgress copy$default(InProgress inProgress, long j, long j2, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = inProgress.bytesUploaded;
                }
                if ((i & 2) != 0) {
                    j2 = inProgress.totalBytes;
                }
                return inProgress.copy(j, j2);
            }

            /* renamed from: component1, reason: from getter */
            public final long getBytesUploaded() {
                return this.bytesUploaded;
            }

            /* renamed from: component2, reason: from getter */
            public final long getTotalBytes() {
                return this.totalBytes;
            }

            public final InProgress copy(long bytesUploaded, long totalBytes) {
                return new InProgress(bytesUploaded, totalBytes);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InProgress)) {
                    return false;
                }
                InProgress inProgress = (InProgress) other;
                if (this.bytesUploaded == inProgress.bytesUploaded && this.totalBytes == inProgress.totalBytes) {
                    return true;
                }
                return false;
            }

            public final long getBytesUploaded() {
                return this.bytesUploaded;
            }

            public final long getTotalBytes() {
                return this.totalBytes;
            }

            public int hashCode() {
                return Long.hashCode(this.totalBytes) + (Long.hashCode(this.bytesUploaded) * 31);
            }

            public String toString() {
                return woa.n(this.totalBytes, ")", ace.p(this.bytesUploaded, "InProgress(bytesUploaded=", ", totalBytes="));
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lio/getstream/chat/android/models/Attachment$UploadState$Success;", "Lio/getstream/chat/android/models/Attachment$UploadState;", "<init>", "()V", "toString", "", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Success extends UploadState {
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ UploadState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UploadState() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\"\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010#\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010$\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0010\u0010%\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010&\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\u0010\u0010'\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u0010\u0010(\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010*\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0010\u0010+\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0010\u0010,\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\bJ\u0010\u0010-\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\bJ\u0010\u0010.\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\u0010\u0010/\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\bJ\u0015\u00100\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u00101J\u0015\u00102\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u00101J\u0010\u00103\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u00104\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u001a\u00105\u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010 J\u0006\u00106\u001a\u00020\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lio/getstream/chat/android/models/Attachment$Builder;", "", "<init>", "()V", "attachment", "Lio/getstream/chat/android/models/Attachment;", "(Lio/getstream/chat/android/models/Attachment;)V", "authorName", "", "authorLink", "titleLink", "thumbUrl", "imageUrl", "assetUrl", "ogUrl", "mimeType", "fileSize", "", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "text", "type", "image", Keys.KEY_NAME, "fallback", "originalHeight", "Ljava/lang/Integer;", "originalWidth", "upload", "Ljava/io/File;", "uploadState", "Lio/getstream/chat/android/models/Attachment$UploadState;", "extraData", "", "withAuthorName", "withAuthorLink", "withTitleLink", "withThumbUrl", "withImageUrl", "withAssetUrl", "withOgUrl", "withMimeType", "withFileSize", "withTitle", "withText", "withType", "withImage", "withName", "withFallback", "withOriginalHeight", "(Ljava/lang/Integer;)Lio/getstream/chat/android/models/Attachment$Builder;", "withOriginalWidth", "withUpload", "withUploadState", "withExtraData", "build", "stream-chat-android-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {
        private String assetUrl;
        private String authorLink;
        private String authorName;
        private Map<String, ? extends Object> extraData;
        private String fallback;
        private int fileSize;
        private String image;
        private String imageUrl;
        private String mimeType;
        private String name;
        private String ogUrl;
        private Integer originalHeight;
        private Integer originalWidth;
        private String text;
        private String thumbUrl;
        private String title;
        private String titleLink;
        private String type;
        private File upload;
        private UploadState uploadState;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Attachment attachment) {
            this();
            attachment.getClass();
            this.authorName = attachment.getAuthorName();
            this.authorLink = attachment.getAuthorLink();
            this.titleLink = attachment.getTitleLink();
            this.thumbUrl = attachment.getThumbUrl();
            this.imageUrl = attachment.getImageUrl();
            this.assetUrl = attachment.getAssetUrl();
            this.ogUrl = attachment.getOgUrl();
            this.mimeType = attachment.getMimeType();
            this.fileSize = attachment.getFileSize();
            this.title = attachment.getTitle();
            this.text = attachment.getText();
            this.type = attachment.getType();
            this.image = attachment.getImage();
            this.name = attachment.getName();
            this.fallback = attachment.getFallback();
            this.originalHeight = attachment.getOriginalHeight();
            this.originalWidth = attachment.getOriginalWidth();
            this.upload = attachment.getUpload();
            this.uploadState = attachment.getUploadState();
            this.extraData = attachment.getExtraData();
        }

        public final Attachment build() {
            return new Attachment(this.authorName, this.authorLink, this.titleLink, this.thumbUrl, this.imageUrl, this.assetUrl, this.ogUrl, this.mimeType, this.fileSize, this.title, this.text, this.type, this.image, this.name, this.fallback, this.originalHeight, this.originalWidth, this.upload, this.uploadState, this.extraData);
        }

        public final Builder withAssetUrl(String assetUrl) {
            this.assetUrl = assetUrl;
            return this;
        }

        public final Builder withAuthorLink(String authorLink) {
            this.authorLink = authorLink;
            return this;
        }

        public final Builder withAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public final Builder withExtraData(Map<String, ? extends Object> extraData) {
            extraData.getClass();
            this.extraData = extraData;
            return this;
        }

        public final Builder withFallback(String fallback) {
            this.fallback = fallback;
            return this;
        }

        public final Builder withFileSize(int fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        public final Builder withImage(String image) {
            this.image = image;
            return this;
        }

        public final Builder withImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public final Builder withMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public final Builder withName(String name) {
            this.name = name;
            return this;
        }

        public final Builder withOgUrl(String ogUrl) {
            this.ogUrl = ogUrl;
            return this;
        }

        public final Builder withOriginalHeight(Integer originalHeight) {
            this.originalHeight = originalHeight;
            return this;
        }

        public final Builder withOriginalWidth(Integer originalWidth) {
            this.originalWidth = originalWidth;
            return this;
        }

        public final Builder withText(String text) {
            this.text = text;
            return this;
        }

        public final Builder withThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }

        public final Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public final Builder withTitleLink(String titleLink) {
            this.titleLink = titleLink;
            return this;
        }

        public final Builder withType(String type) {
            this.type = type;
            return this;
        }

        public final Builder withUpload(File upload) {
            this.upload = upload;
            return this;
        }

        public final Builder withUploadState(UploadState uploadState) {
            this.uploadState = uploadState;
            return this;
        }

        public Builder() {
            zc7 zc7Var = zc7.a;
            zc7Var.getClass();
            this.extraData = zc7Var;
        }
    }

    public Attachment() {
        this(null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public Attachment(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Integer num2, File file, UploadState uploadState, Map<String, ? extends Object> map) {
        map.getClass();
        this.authorName = str;
        this.authorLink = str2;
        this.titleLink = str3;
        this.thumbUrl = str4;
        this.imageUrl = str5;
        this.assetUrl = str6;
        this.ogUrl = str7;
        this.mimeType = str8;
        this.fileSize = i;
        this.title = str9;
        this.text = str10;
        this.type = str11;
        this.image = str12;
        this.name = str13;
        this.fallback = str14;
        this.originalHeight = num;
        this.originalWidth = num2;
        this.upload = file;
        this.uploadState = uploadState;
        this.extraData = map;
    }
}
