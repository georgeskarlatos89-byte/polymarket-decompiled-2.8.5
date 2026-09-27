package io.getstream.chat.android.client.api2.model.dto;

import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.k84;
import defpackage.m51;
import defpackage.mda;
import io.radar.sdk.RadarTrackingOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u0015\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003Jð\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010G\u001a\u00020\bHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b,\u0010 R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b-\u0010 R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/¨\u0006I"}, d2 = {"Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "Lio/getstream/chat/android/client/api2/model/dto/ExtraDataDto;", "asset_url", "", "author_name", "author_link", "fallback", "file_size", "", "image", "image_url", "mime_type", Keys.KEY_NAME, "og_scrape_url", "text", "thumb_url", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "title_link", "type", "original_height", "original_width", "extraData", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V", "getAsset_url", "()Ljava/lang/String;", "getAuthor_name", "getAuthor_link", "getFallback", "getFile_size", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "getImage_url", "getMime_type", "getName", "getOg_scrape_url", "getText", "getThumb_url", "getTitle", "getTitle_link", "getType", "getOriginal_height", "getOriginal_width", "getExtraData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)Lio/getstream/chat/android/client/api2/model/dto/AttachmentDto;", "equals", "", "other", "hashCode", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class AttachmentDto implements ExtraDataDto {
    private final String asset_url;
    private final String author_link;
    private final String author_name;
    private final Map<String, Object> extraData;
    private final String fallback;
    private final Integer file_size;
    private final String image;
    private final String image_url;
    private final String mime_type;
    private final String name;
    private final String og_scrape_url;
    private final Integer original_height;
    private final Integer original_width;
    private final String text;
    private final String thumb_url;
    private final String title;
    private final String title_link;
    private final String type;

    public AttachmentDto(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num2, Integer num3, Map<String, ? extends Object> map) {
        map.getClass();
        this.asset_url = str;
        this.author_name = str2;
        this.author_link = str3;
        this.fallback = str4;
        this.file_size = num;
        this.image = str5;
        this.image_url = str6;
        this.mime_type = str7;
        this.name = str8;
        this.og_scrape_url = str9;
        this.text = str10;
        this.thumb_url = str11;
        this.title = str12;
        this.title_link = str13;
        this.type = str14;
        this.original_height = num2;
        this.original_width = num3;
        this.extraData = map;
    }

    public static /* synthetic */ AttachmentDto copy$default(AttachmentDto attachmentDto, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num2, Integer num3, Map map, int i, Object obj) {
        String str15;
        String str16;
        String str17;
        String str18;
        Integer num4;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        Integer num5;
        Integer num6;
        Map map2;
        Integer num7;
        if ((i & 1) != 0) {
            str15 = attachmentDto.asset_url;
        } else {
            str15 = str;
        }
        if ((i & 2) != 0) {
            str16 = attachmentDto.author_name;
        } else {
            str16 = str2;
        }
        if ((i & 4) != 0) {
            str17 = attachmentDto.author_link;
        } else {
            str17 = str3;
        }
        if ((i & 8) != 0) {
            str18 = attachmentDto.fallback;
        } else {
            str18 = str4;
        }
        if ((i & 16) != 0) {
            num4 = attachmentDto.file_size;
        } else {
            num4 = num;
        }
        if ((i & 32) != 0) {
            str19 = attachmentDto.image;
        } else {
            str19 = str5;
        }
        if ((i & 64) != 0) {
            str20 = attachmentDto.image_url;
        } else {
            str20 = str6;
        }
        if ((i & 128) != 0) {
            str21 = attachmentDto.mime_type;
        } else {
            str21 = str7;
        }
        if ((i & 256) != 0) {
            str22 = attachmentDto.name;
        } else {
            str22 = str8;
        }
        if ((i & Barcode.FORMAT_UPC_A) != 0) {
            str23 = attachmentDto.og_scrape_url;
        } else {
            str23 = str9;
        }
        if ((i & Barcode.FORMAT_UPC_E) != 0) {
            str24 = attachmentDto.text;
        } else {
            str24 = str10;
        }
        if ((i & 2048) != 0) {
            str25 = attachmentDto.thumb_url;
        } else {
            str25 = str11;
        }
        if ((i & 4096) != 0) {
            str26 = attachmentDto.title;
        } else {
            str26 = str12;
        }
        if ((i & 8192) != 0) {
            str27 = attachmentDto.title_link;
        } else {
            str27 = str13;
        }
        String str29 = str15;
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            str28 = attachmentDto.type;
        } else {
            str28 = str14;
        }
        if ((i & 32768) != 0) {
            num5 = attachmentDto.original_height;
        } else {
            num5 = num2;
        }
        Integer num8 = num5;
        if ((i & 65536) != 0) {
            num6 = attachmentDto.original_width;
        } else {
            num6 = num3;
        }
        if ((i & 131072) != 0) {
            num7 = num6;
            map2 = attachmentDto.extraData;
        } else {
            map2 = map;
            num7 = num6;
        }
        return attachmentDto.copy(str29, str16, str17, str18, num4, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, num8, num7, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAsset_url() {
        return this.asset_url;
    }

    /* renamed from: component10, reason: from getter */
    public final String getOg_scrape_url() {
        return this.og_scrape_url;
    }

    /* renamed from: component11, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component12, reason: from getter */
    public final String getThumb_url() {
        return this.thumb_url;
    }

    /* renamed from: component13, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component14, reason: from getter */
    public final String getTitle_link() {
        return this.title_link;
    }

    /* renamed from: component15, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component16, reason: from getter */
    public final Integer getOriginal_height() {
        return this.original_height;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getOriginal_width() {
        return this.original_width;
    }

    public final Map<String, Object> component18() {
        return this.extraData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAuthor_name() {
        return this.author_name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAuthor_link() {
        return this.author_link;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFallback() {
        return this.fallback;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getFile_size() {
        return this.file_size;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: component7, reason: from getter */
    public final String getImage_url() {
        return this.image_url;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMime_type() {
        return this.mime_type;
    }

    /* renamed from: component9, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final AttachmentDto copy(String asset_url, String author_name, String author_link, String fallback, Integer file_size, String image, String image_url, String mime_type, String name, String og_scrape_url, String text, String thumb_url, String title, String title_link, String type, Integer original_height, Integer original_width, Map<String, ? extends Object> extraData) {
        extraData.getClass();
        return new AttachmentDto(asset_url, author_name, author_link, fallback, file_size, image, image_url, mime_type, name, og_scrape_url, text, thumb_url, title, title_link, type, original_height, original_width, extraData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentDto)) {
            return false;
        }
        AttachmentDto attachmentDto = (AttachmentDto) other;
        if (Intrinsics.areEqual(this.asset_url, attachmentDto.asset_url) && Intrinsics.areEqual(this.author_name, attachmentDto.author_name) && Intrinsics.areEqual(this.author_link, attachmentDto.author_link) && Intrinsics.areEqual(this.fallback, attachmentDto.fallback) && Intrinsics.areEqual(this.file_size, attachmentDto.file_size) && Intrinsics.areEqual(this.image, attachmentDto.image) && Intrinsics.areEqual(this.image_url, attachmentDto.image_url) && Intrinsics.areEqual(this.mime_type, attachmentDto.mime_type) && Intrinsics.areEqual(this.name, attachmentDto.name) && Intrinsics.areEqual(this.og_scrape_url, attachmentDto.og_scrape_url) && Intrinsics.areEqual(this.text, attachmentDto.text) && Intrinsics.areEqual(this.thumb_url, attachmentDto.thumb_url) && Intrinsics.areEqual(this.title, attachmentDto.title) && Intrinsics.areEqual(this.title_link, attachmentDto.title_link) && Intrinsics.areEqual(this.type, attachmentDto.type) && Intrinsics.areEqual(this.original_height, attachmentDto.original_height) && Intrinsics.areEqual(this.original_width, attachmentDto.original_width) && Intrinsics.areEqual(this.extraData, attachmentDto.extraData)) {
            return true;
        }
        return false;
    }

    public final String getAsset_url() {
        return this.asset_url;
    }

    public final String getAuthor_link() {
        return this.author_link;
    }

    public final String getAuthor_name() {
        return this.author_name;
    }

    public final Map<String, Object> getExtraData() {
        return this.extraData;
    }

    public final String getFallback() {
        return this.fallback;
    }

    public final Integer getFile_size() {
        return this.file_size;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImage_url() {
        return this.image_url;
    }

    public final String getMime_type() {
        return this.mime_type;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOg_scrape_url() {
        return this.og_scrape_url;
    }

    public final Integer getOriginal_height() {
        return this.original_height;
    }

    public final Integer getOriginal_width() {
        return this.original_width;
    }

    public final String getText() {
        return this.text;
    }

    public final String getThumb_url() {
        return this.thumb_url;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitle_link() {
        return this.title_link;
    }

    public final String getType() {
        return this.type;
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
        String str = this.asset_url;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.author_name;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.author_link;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.fallback;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Integer num = this.file_size;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this.image;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str6 = this.image_url;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str7 = this.mime_type;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        String str8 = this.name;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        String str9 = this.og_scrape_url;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i11 = (i10 + hashCode10) * 31;
        String str10 = this.text;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i12 = (i11 + hashCode11) * 31;
        String str11 = this.thumb_url;
        if (str11 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str11.hashCode();
        }
        int i13 = (i12 + hashCode12) * 31;
        String str12 = this.title;
        if (str12 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str12.hashCode();
        }
        int i14 = (i13 + hashCode13) * 31;
        String str13 = this.title_link;
        if (str13 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str13.hashCode();
        }
        int i15 = (i14 + hashCode14) * 31;
        String str14 = this.type;
        if (str14 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str14.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        Integer num2 = this.original_height;
        if (num2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num2.hashCode();
        }
        int i17 = (i16 + hashCode16) * 31;
        Integer num3 = this.original_width;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return this.extraData.hashCode() + ((i17 + i) * 31);
    }

    public String toString() {
        String str = this.asset_url;
        String str2 = this.author_name;
        String str3 = this.author_link;
        String str4 = this.fallback;
        Integer num = this.file_size;
        String str5 = this.image;
        String str6 = this.image_url;
        String str7 = this.mime_type;
        String str8 = this.name;
        String str9 = this.og_scrape_url;
        String str10 = this.text;
        String str11 = this.thumb_url;
        String str12 = this.title;
        String str13 = this.title_link;
        String str14 = this.type;
        Integer num2 = this.original_height;
        Integer num3 = this.original_width;
        Map<String, Object> map = this.extraData;
        StringBuilder r = m51.r("AttachmentDto(asset_url=", str, ", author_name=", str2, ", author_link=");
        k84.q(r, str3, ", fallback=", str4, ", file_size=");
        r.append(num);
        r.append(", image=");
        r.append(str5);
        r.append(", image_url=");
        k84.q(r, str6, ", mime_type=", str7, ", name=");
        k84.q(r, str8, ", og_scrape_url=", str9, ", text=");
        k84.q(r, str10, ", thumb_url=", str11, ", title=");
        k84.q(r, str12, ", title_link=", str13, ", type=");
        r.append(str14);
        r.append(", original_height=");
        r.append(num2);
        r.append(", original_width=");
        r.append(num3);
        r.append(", extraData=");
        r.append(map);
        r.append(")");
        return r.toString();
    }
}
