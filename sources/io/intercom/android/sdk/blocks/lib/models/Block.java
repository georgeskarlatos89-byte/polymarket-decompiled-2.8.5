package io.intercom.android.sdk.blocks.lib.models;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.lib.BlockAlignment;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.ConversationRatingOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class Block implements Parcelable {
    public static final Parcelable.Creator<Block> CREATOR = new Parcelable.Creator<Block>() { // from class: io.intercom.android.sdk.blocks.lib.models.Block.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Block createFromParcel(Parcel parcel) {
            return new Block(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Block[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Block[] newArray(int i) {
            return new Block[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Block createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    };
    private final BlockAlignment align;
    private final String articleId;
    private final List<BlockAttachment> attachments;
    private final String attribution;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final long duration;
    private final String fallbackUrl;
    private final Link footerLink;
    private final int height;
    private final String id;
    private final Image image;
    private final int imageHeight;
    private final String imageUrl;
    private final int imageWidth;
    private final List<String> items;
    private final String language;
    private final String linkType;
    private final String linkUrl;
    private final List<Link> links;
    private final Uri local_uri;
    private final List<ConversationRatingOption> options;
    private final String previewUrl;
    private final String provider;
    private final int ratingIndex;
    private final String remark;
    private final String siteName;
    private final String text;
    private final String thumbnailUrl;
    private long ticketTypeId;
    private final TicketType ticket_type;
    private final String ticket_type_title;
    private final String title;
    private final String trackingUrl;
    private final BlockType type;
    private final String url;
    private final String username;
    private final int width;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* renamed from: io.intercom.android.sdk.blocks.lib.models.Block$2, reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType;

        static {
            int[] iArr = new int[BlockType.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType = iArr;
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.LOCALIMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[BlockType.LOCAL_ATTACHMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        String align;
        String articleId;
        List<BlockAttachment> attachments;
        String attribution;
        Author author;
        Map<String, String> data;
        String description;
        Long duration;
        String fallbackUrl;
        Builder footerLink;
        Integer height;
        String id;
        Image image;
        Integer imageHeight;
        String imageUrl;
        Integer imageWidth;
        List<String> items;
        String language;
        String linkType;
        String linkUrl;
        List<Builder> links;
        Uri local_uri;
        List<ConversationRatingOption.Builder> options;
        String previewUrl;
        String provider;
        Integer ratingIndex;
        Integer rating_index;
        String remark;
        String siteName;
        String text;
        String thumbnailUrl;
        TicketType ticket_type;
        long ticket_type_id;
        String ticket_type_title;
        String title;
        String trackingUrl;
        String type;
        String url;
        String username;
        Integer width;

        public Block build() {
            return new Block(this, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Builder.class == obj.getClass()) {
                Builder builder = (Builder) obj;
                String str = this.type;
                String str2 = builder.type;
                if (str == null ? str2 != null : !str.equals(str2)) {
                    return false;
                }
                String str3 = this.text;
                String str4 = builder.text;
                if (str3 == null ? str4 != null : !str3.equals(str4)) {
                    return false;
                }
                String str5 = this.title;
                String str6 = builder.title;
                if (str5 == null ? str6 != null : !str5.equals(str6)) {
                    return false;
                }
                String str7 = this.description;
                String str8 = builder.description;
                if (str7 == null ? str8 != null : !str7.equals(str8)) {
                    return false;
                }
                String str9 = this.linkType;
                String str10 = builder.linkType;
                if (str9 == null ? str10 != null : !str9.equals(str10)) {
                    return false;
                }
                String str11 = this.siteName;
                String str12 = builder.siteName;
                if (str11 == null ? str12 != null : !str11.equals(str12)) {
                    return false;
                }
                String str13 = this.articleId;
                String str14 = builder.articleId;
                if (str13 == null ? str14 != null : !str13.equals(str14)) {
                    return false;
                }
                Author author = this.author;
                Author author2 = builder.author;
                if (author == null ? author2 != null : !author.equals(author2)) {
                    return false;
                }
                Image image = this.image;
                Image image2 = builder.image;
                if (image == null ? image2 != null : !image.equals(image2)) {
                    return false;
                }
                Map<String, String> map = this.data;
                Map<String, String> map2 = builder.data;
                if (map == null ? map2 != null : !map.equals(map2)) {
                    return false;
                }
                String str15 = this.language;
                String str16 = builder.language;
                if (str15 == null ? str16 != null : !str15.equals(str16)) {
                    return false;
                }
                String str17 = this.url;
                String str18 = builder.url;
                if (str17 == null ? str18 != null : !str17.equals(str18)) {
                    return false;
                }
                String str19 = this.thumbnailUrl;
                String str20 = builder.thumbnailUrl;
                if (str19 == null ? str20 != null : !str19.equals(str20)) {
                    return false;
                }
                String str21 = this.linkUrl;
                String str22 = builder.linkUrl;
                if (str21 == null ? str22 != null : !str21.equals(str22)) {
                    return false;
                }
                String str23 = this.trackingUrl;
                String str24 = builder.trackingUrl;
                if (str23 == null ? str24 != null : !str23.equals(str24)) {
                    return false;
                }
                String str25 = this.fallbackUrl;
                String str26 = builder.fallbackUrl;
                if (str25 == null ? str26 != null : !str25.equals(str26)) {
                    return false;
                }
                String str27 = this.username;
                String str28 = builder.username;
                if (str27 == null ? str28 != null : !str27.equals(str28)) {
                    return false;
                }
                String str29 = this.provider;
                String str30 = builder.provider;
                if (str29 == null ? str30 != null : !str29.equals(str30)) {
                    return false;
                }
                String str31 = this.id;
                String str32 = builder.id;
                if (str31 == null ? str32 != null : !str31.equals(str32)) {
                    return false;
                }
                String str33 = this.align;
                String str34 = builder.align;
                if (str33 == null ? str34 != null : !str33.equals(str34)) {
                    return false;
                }
                Integer num = this.width;
                Integer num2 = builder.width;
                if (num == null ? num2 != null : !num.equals(num2)) {
                    return false;
                }
                Integer num3 = this.height;
                Integer num4 = builder.height;
                if (num3 == null ? num4 != null : !num3.equals(num4)) {
                    return false;
                }
                Long l = this.duration;
                Long l2 = builder.duration;
                if (l == null ? l2 != null : !l.equals(l2)) {
                    return false;
                }
                String str35 = this.previewUrl;
                String str36 = builder.previewUrl;
                if (str35 == null ? str36 != null : !str35.equals(str36)) {
                    return false;
                }
                String str37 = this.attribution;
                String str38 = builder.attribution;
                if (str37 == null ? str38 != null : !str37.equals(str38)) {
                    return false;
                }
                List<BlockAttachment> list = this.attachments;
                List<BlockAttachment> list2 = builder.attachments;
                if (list == null ? list2 != null : !list.equals(list2)) {
                    return false;
                }
                List<String> list3 = this.items;
                List<String> list4 = builder.items;
                if (list3 == null ? list4 != null : !list3.equals(list4)) {
                    return false;
                }
                Integer num5 = this.rating_index;
                Integer num6 = builder.rating_index;
                if (num5 == null ? num6 != null : !num5.equals(num6)) {
                    return false;
                }
                Integer num7 = this.ratingIndex;
                Integer num8 = builder.ratingIndex;
                if (num7 == null ? num8 != null : !num7.equals(num8)) {
                    return false;
                }
                String str39 = this.remark;
                String str40 = builder.remark;
                if (str39 == null ? str40 != null : !str39.equals(str40)) {
                    return false;
                }
                List<ConversationRatingOption.Builder> list5 = this.options;
                List<ConversationRatingOption.Builder> list6 = builder.options;
                if (list5 == null ? list6 != null : !list5.equals(list6)) {
                    return false;
                }
                List<Builder> list7 = this.links;
                List<Builder> list8 = builder.links;
                if (list7 == null ? list8 != null : !list7.equals(list8)) {
                    return false;
                }
                String str41 = this.imageUrl;
                String str42 = builder.imageUrl;
                if (str41 == null ? str42 != null : !str41.equals(str42)) {
                    return false;
                }
                Integer num9 = this.imageWidth;
                Integer num10 = builder.imageWidth;
                if (num9 == null ? num10 != null : !num9.equals(num10)) {
                    return false;
                }
                Integer num11 = this.imageHeight;
                Integer num12 = builder.imageHeight;
                if (num11 == null ? num12 != null : !num11.equals(num12)) {
                    return false;
                }
                String str43 = this.ticket_type_title;
                String str44 = builder.ticket_type_title;
                if (str43 == null ? str44 != null : !str43.equals(str44)) {
                    return false;
                }
                TicketType ticketType = this.ticket_type;
                TicketType ticketType2 = builder.ticket_type;
                if (ticketType == null ? ticketType2 != null : !ticketType.equals(ticketType2)) {
                    return false;
                }
                if (!Long.valueOf(this.ticket_type_id).equals(Long.valueOf(builder.ticket_type_id))) {
                    return false;
                }
                Builder builder2 = this.footerLink;
                Builder builder3 = builder.footerLink;
                if (builder2 != null) {
                    return builder2.equals(builder3);
                }
                if (builder3 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            int i29;
            int i30;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            int i37;
            String str = this.type;
            int i38 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i39 = i * 31;
            String str2 = this.text;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i40 = (i39 + i2) * 31;
            String str3 = this.title;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i41 = (i40 + i3) * 31;
            String str4 = this.description;
            if (str4 != null) {
                i4 = str4.hashCode();
            } else {
                i4 = 0;
            }
            int i42 = (i41 + i4) * 31;
            String str5 = this.linkType;
            if (str5 != null) {
                i5 = str5.hashCode();
            } else {
                i5 = 0;
            }
            int i43 = (i42 + i5) * 31;
            String str6 = this.siteName;
            if (str6 != null) {
                i6 = str6.hashCode();
            } else {
                i6 = 0;
            }
            int i44 = (i43 + i6) * 31;
            String str7 = this.articleId;
            if (str7 != null) {
                i7 = str7.hashCode();
            } else {
                i7 = 0;
            }
            int i45 = (i44 + i7) * 31;
            Author author = this.author;
            if (author != null) {
                i8 = author.hashCode();
            } else {
                i8 = 0;
            }
            int i46 = (i45 + i8) * 31;
            Image image = this.image;
            if (image != null) {
                i9 = image.hashCode();
            } else {
                i9 = 0;
            }
            int i47 = (i46 + i9) * 31;
            Map<String, String> map = this.data;
            if (map != null) {
                i10 = map.hashCode();
            } else {
                i10 = 0;
            }
            int i48 = (i47 + i10) * 31;
            String str8 = this.language;
            if (str8 != null) {
                i11 = str8.hashCode();
            } else {
                i11 = 0;
            }
            int i49 = (i48 + i11) * 31;
            String str9 = this.url;
            if (str9 != null) {
                i12 = str9.hashCode();
            } else {
                i12 = 0;
            }
            int i50 = (i49 + i12) * 31;
            String str10 = this.thumbnailUrl;
            if (str10 != null) {
                i13 = str10.hashCode();
            } else {
                i13 = 0;
            }
            int i51 = (i50 + i13) * 31;
            String str11 = this.linkUrl;
            if (str11 != null) {
                i14 = str11.hashCode();
            } else {
                i14 = 0;
            }
            int i52 = (i51 + i14) * 31;
            String str12 = this.trackingUrl;
            if (str12 != null) {
                i15 = str12.hashCode();
            } else {
                i15 = 0;
            }
            int i53 = (i52 + i15) * 31;
            String str13 = this.fallbackUrl;
            if (str13 != null) {
                i16 = str13.hashCode();
            } else {
                i16 = 0;
            }
            int i54 = (i53 + i16) * 31;
            String str14 = this.username;
            if (str14 != null) {
                i17 = str14.hashCode();
            } else {
                i17 = 0;
            }
            int i55 = (i54 + i17) * 31;
            String str15 = this.provider;
            if (str15 != null) {
                i18 = str15.hashCode();
            } else {
                i18 = 0;
            }
            int i56 = (i55 + i18) * 31;
            String str16 = this.id;
            if (str16 != null) {
                i19 = str16.hashCode();
            } else {
                i19 = 0;
            }
            int i57 = (i56 + i19) * 31;
            String str17 = this.align;
            if (str17 != null) {
                i20 = str17.hashCode();
            } else {
                i20 = 0;
            }
            int i58 = (i57 + i20) * 31;
            Integer num = this.width;
            if (num != null) {
                i21 = num.hashCode();
            } else {
                i21 = 0;
            }
            int i59 = (i58 + i21) * 31;
            Integer num2 = this.height;
            if (num2 != null) {
                i22 = num2.hashCode();
            } else {
                i22 = 0;
            }
            int i60 = (i59 + i22) * 31;
            Long l = this.duration;
            if (l != null) {
                i23 = l.hashCode();
            } else {
                i23 = 0;
            }
            int i61 = (i60 + i23) * 31;
            String str18 = this.previewUrl;
            if (str18 != null) {
                i24 = str18.hashCode();
            } else {
                i24 = 0;
            }
            int i62 = (i61 + i24) * 31;
            String str19 = this.attribution;
            if (str19 != null) {
                i25 = str19.hashCode();
            } else {
                i25 = 0;
            }
            int i63 = (i62 + i25) * 31;
            List<BlockAttachment> list = this.attachments;
            if (list != null) {
                i26 = list.hashCode();
            } else {
                i26 = 0;
            }
            int i64 = (i63 + i26) * 31;
            List<String> list2 = this.items;
            if (list2 != null) {
                i27 = list2.hashCode();
            } else {
                i27 = 0;
            }
            int i65 = (i64 + i27) * 31;
            Integer num3 = this.rating_index;
            if (num3 != null) {
                i28 = num3.hashCode();
            } else {
                i28 = 0;
            }
            int i66 = (i65 + i28) * 31;
            Integer num4 = this.ratingIndex;
            if (num4 != null) {
                i29 = num4.hashCode();
            } else {
                i29 = 0;
            }
            int i67 = (i66 + i29) * 31;
            String str20 = this.remark;
            if (str20 != null) {
                i30 = str20.hashCode();
            } else {
                i30 = 0;
            }
            int i68 = (i67 + i30) * 31;
            List<ConversationRatingOption.Builder> list3 = this.options;
            if (list3 != null) {
                i31 = list3.hashCode();
            } else {
                i31 = 0;
            }
            int i69 = (i68 + i31) * 31;
            List<Builder> list4 = this.links;
            if (list4 != null) {
                i32 = list4.hashCode();
            } else {
                i32 = 0;
            }
            int i70 = (i69 + i32) * 31;
            Builder builder = this.footerLink;
            if (builder != null) {
                i33 = builder.hashCode();
            } else {
                i33 = 0;
            }
            int i71 = (i70 + i33) * 31;
            String str21 = this.imageUrl;
            if (str21 != null) {
                i34 = str21.hashCode();
            } else {
                i34 = 0;
            }
            int i72 = (i71 + i34) * 31;
            Integer num5 = this.imageWidth;
            if (num5 != null) {
                i35 = num5.hashCode();
            } else {
                i35 = 0;
            }
            int i73 = (i72 + i35) * 31;
            Integer num6 = this.imageHeight;
            if (num6 != null) {
                i36 = num6.hashCode();
            } else {
                i36 = 0;
            }
            int i74 = (i73 + i36) * 31;
            String str22 = this.ticket_type_title;
            if (str22 != null) {
                i37 = str22.hashCode();
            } else {
                i37 = 0;
            }
            int i75 = (i74 + i37) * 31;
            TicketType ticketType = this.ticket_type;
            if (ticketType != null) {
                i38 = ticketType.hashCode();
            }
            int i76 = (i75 + i38) * 31;
            long j = this.ticket_type_id;
            return i76 + ((int) (j ^ (j >>> 32)));
        }

        public Builder withAlign(String str) {
            this.align = str;
            return this;
        }

        public Builder withArticleId(String str) {
            this.articleId = str;
            return this;
        }

        public Builder withAttachments(List<BlockAttachment> list) {
            this.attachments = list;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
            return this;
        }

        public Builder withAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Builder withData(Map<String, String> map) {
            this.data = map;
            return this;
        }

        public Builder withDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder withDuration(long j) {
            this.duration = Long.valueOf(j);
            return this;
        }

        public Builder withHeight(int i) {
            this.height = Integer.valueOf(i);
            return this;
        }

        public Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Builder withImageHeight(int i) {
            this.imageHeight = Integer.valueOf(i);
            return this;
        }

        public Builder withImageUrl(String str) {
            this.imageUrl = str;
            return this;
        }

        public Builder withImageWidth(int i) {
            this.imageWidth = Integer.valueOf(i);
            return this;
        }

        public Builder withItems(List<String> list) {
            this.items = list;
            return this;
        }

        public Builder withLinkType(String str) {
            this.linkType = str;
            return this;
        }

        public Builder withLocalUri(Uri uri) {
            this.local_uri = uri;
            return this;
        }

        public Builder withOptions(List<ConversationRatingOption.Builder> list) {
            this.options = list;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withRatingIndex(Integer num) {
            this.ratingIndex = num;
            return this;
        }

        public Builder withRemark(String str) {
            this.remark = str;
            return this;
        }

        public Builder withSiteName(String str) {
            this.siteName = str;
            return this;
        }

        public Builder withText(String str) {
            this.text = str;
            return this;
        }

        public Builder withThumbnailUrl(String str) {
            this.thumbnailUrl = str;
            return this;
        }

        public Builder withTicketType(TicketType ticketType) {
            this.ticket_type = ticketType;
            return this;
        }

        public Builder withTicketTypeTitle(String str) {
            this.ticket_type_title = str;
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder withWidth(int i) {
            this.width = Integer.valueOf(i);
            return this;
        }
    }

    private Block(Builder builder) {
        int intValue;
        int intValue2;
        long longValue;
        int intValue3;
        Link fromBlock;
        this.type = BlockType.typeValueOf(builder.type);
        String str = builder.text;
        this.text = str == null ? "" : str;
        String str2 = builder.title;
        this.title = str2 == null ? "" : str2;
        String str3 = builder.description;
        this.description = str3 == null ? "" : str3;
        String str4 = builder.linkType;
        this.linkType = str4 == null ? "" : str4;
        String str5 = builder.siteName;
        this.siteName = str5 == null ? "" : str5;
        String str6 = builder.articleId;
        this.articleId = str6 == null ? "" : str6;
        Author author = builder.author;
        this.author = author == null ? new Author() : author;
        Image image = builder.image;
        this.image = image == null ? new Image() : image;
        Map<String, String> map = builder.data;
        this.data = map == null ? Collections.EMPTY_MAP : map;
        String str7 = builder.language;
        this.language = str7 == null ? "" : str7;
        String str8 = builder.url;
        this.url = str8 == null ? "" : str8;
        String str9 = builder.thumbnailUrl;
        this.thumbnailUrl = str9 == null ? "" : str9;
        String str10 = builder.linkUrl;
        this.linkUrl = str10 == null ? "" : str10;
        String str11 = builder.trackingUrl;
        this.trackingUrl = str11 == null ? "" : str11;
        String str12 = builder.fallbackUrl;
        this.fallbackUrl = str12 == null ? "" : str12;
        String str13 = builder.username;
        this.username = str13 == null ? "" : str13;
        String str14 = builder.provider;
        this.provider = str14 == null ? "" : str14;
        String str15 = builder.id;
        this.id = str15 == null ? "" : str15;
        this.align = BlockAlignment.alignValueOf(builder.align);
        Integer num = builder.width;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        this.width = intValue;
        Integer num2 = builder.height;
        if (num2 == null) {
            intValue2 = 0;
        } else {
            intValue2 = num2.intValue();
        }
        this.height = intValue2;
        Long l = builder.duration;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        this.duration = longValue;
        String str16 = builder.previewUrl;
        this.previewUrl = str16 == null ? "" : str16;
        String str17 = builder.attribution;
        this.attribution = str17 == null ? "" : str17;
        Uri uri = builder.local_uri;
        this.local_uri = uri == null ? Uri.EMPTY : uri;
        String str18 = builder.imageUrl;
        this.imageUrl = str18 == null ? "" : str18;
        Integer num3 = builder.imageWidth;
        if (num3 == null) {
            intValue3 = 0;
        } else {
            intValue3 = num3.intValue();
        }
        this.imageWidth = intValue3;
        Integer num4 = builder.imageHeight;
        this.imageHeight = num4 != null ? num4.intValue() : 0;
        this.attachments = new ArrayList();
        List<BlockAttachment> list = builder.attachments;
        if (list != null) {
            for (BlockAttachment blockAttachment : list) {
                if (blockAttachment != null) {
                    this.attachments.add(blockAttachment);
                }
            }
        }
        this.items = new ArrayList();
        List<String> list2 = builder.items;
        if (list2 != null) {
            for (String str19 : list2) {
                if (str19 != null) {
                    this.items.add(str19);
                }
            }
        }
        Integer num5 = builder.ratingIndex;
        if (num5 != null) {
            this.ratingIndex = num5.intValue();
        } else {
            Integer num6 = builder.rating_index;
            if (num6 != null) {
                this.ratingIndex = num6.intValue();
            } else {
                this.ratingIndex = -1;
            }
        }
        String str20 = builder.remark;
        this.remark = str20 == null ? "" : str20;
        this.options = new ArrayList();
        List<ConversationRatingOption.Builder> list3 = builder.options;
        if (list3 != null) {
            for (ConversationRatingOption.Builder builder2 : list3) {
                if (builder2 != null) {
                    this.options.add(builder2.build());
                }
            }
        }
        this.links = new ArrayList();
        List<Builder> list4 = builder.links;
        if (list4 != null) {
            for (Builder builder3 : list4) {
                if (builder3 != null) {
                    this.links.add(Link.fromBlock(builder3.build()));
                }
            }
        }
        Builder builder4 = builder.footerLink;
        if (builder4 == null) {
            fromBlock = new Link();
        } else {
            fromBlock = Link.fromBlock(builder4.build());
        }
        this.footerLink = fromBlock;
        String str21 = builder.ticket_type_title;
        this.ticket_type_title = str21 != null ? str21 : "";
        TicketType ticketType = builder.ticket_type;
        this.ticket_type = ticketType == null ? TicketType.INSTANCE.getNULL() : ticketType;
        this.ticketTypeId = builder.ticket_type_id;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Block block = (Block) obj;
            if (this.width != block.width || this.height != block.height || this.ratingIndex != block.ratingIndex) {
                return false;
            }
            List<BlockAttachment> list = this.attachments;
            List<BlockAttachment> list2 = block.attachments;
            if (list == null ? list2 != null : !list.equals(list2)) {
                return false;
            }
            List<String> list3 = this.items;
            List<String> list4 = block.items;
            if (list3 == null ? list4 != null : !list3.equals(list4)) {
                return false;
            }
            Map<String, String> map = this.data;
            Map<String, String> map2 = block.data;
            if (map == null ? map2 != null : !map.equals(map2)) {
                return false;
            }
            if (this.type != block.type || this.align != block.align) {
                return false;
            }
            Author author = this.author;
            Author author2 = block.author;
            if (author == null ? author2 != null : !author.equals(author2)) {
                return false;
            }
            Image image = this.image;
            Image image2 = block.image;
            if (image == null ? image2 != null : !image.equals(image2)) {
                return false;
            }
            String str = this.text;
            String str2 = block.text;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.title;
            String str4 = block.title;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.description;
            String str6 = block.description;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            String str7 = this.linkType;
            String str8 = block.linkType;
            if (str7 == null ? str8 != null : !str7.equals(str8)) {
                return false;
            }
            String str9 = this.siteName;
            String str10 = block.siteName;
            if (str9 == null ? str10 != null : !str9.equals(str10)) {
                return false;
            }
            String str11 = this.articleId;
            String str12 = block.articleId;
            if (str11 == null ? str12 != null : !str11.equals(str12)) {
                return false;
            }
            String str13 = this.language;
            String str14 = block.language;
            if (str13 == null ? str14 != null : !str13.equals(str14)) {
                return false;
            }
            String str15 = this.url;
            String str16 = block.url;
            if (str15 == null ? str16 != null : !str15.equals(str16)) {
                return false;
            }
            String str17 = this.thumbnailUrl;
            String str18 = block.thumbnailUrl;
            if (str17 == null ? str18 != null : !str17.equals(str18)) {
                return false;
            }
            String str19 = this.previewUrl;
            String str20 = block.previewUrl;
            if (str19 == null ? str20 != null : !str19.equals(str20)) {
                return false;
            }
            String str21 = this.attribution;
            String str22 = block.attribution;
            if (str21 == null ? str22 != null : !str21.equals(str22)) {
                return false;
            }
            String str23 = this.linkUrl;
            String str24 = block.linkUrl;
            if (str23 == null ? str24 != null : !str23.equals(str24)) {
                return false;
            }
            String str25 = this.trackingUrl;
            String str26 = block.trackingUrl;
            if (str25 == null ? str26 != null : !str25.equals(str26)) {
                return false;
            }
            String str27 = this.fallbackUrl;
            String str28 = block.fallbackUrl;
            if (str27 == null ? str28 != null : !str27.equals(str28)) {
                return false;
            }
            String str29 = this.username;
            String str30 = block.username;
            if (str29 == null ? str30 != null : !str29.equals(str30)) {
                return false;
            }
            String str31 = this.provider;
            String str32 = block.provider;
            if (str31 == null ? str32 != null : !str31.equals(str32)) {
                return false;
            }
            String str33 = this.id;
            String str34 = block.id;
            if (str33 == null ? str34 != null : !str33.equals(str34)) {
                return false;
            }
            String str35 = this.remark;
            String str36 = block.remark;
            if (str35 == null ? str36 != null : !str35.equals(str36)) {
                return false;
            }
            List<ConversationRatingOption> list5 = this.options;
            List<ConversationRatingOption> list6 = block.options;
            if (list5 == null ? list6 != null : !list5.equals(list6)) {
                return false;
            }
            List<Link> list7 = this.links;
            List<Link> list8 = block.links;
            if (list7 == null ? list8 != null : !list7.equals(list8)) {
                return false;
            }
            Uri uri = this.local_uri;
            Uri uri2 = block.local_uri;
            if (uri == null ? uri2 != null : !uri.equals(uri2)) {
                return false;
            }
            String str37 = this.imageUrl;
            String str38 = block.imageUrl;
            if (str37 == null ? str38 != null : !str37.equals(str38)) {
                return false;
            }
            if (this.imageWidth != block.imageWidth || this.imageHeight != block.imageHeight) {
                return false;
            }
            String str39 = this.ticket_type_title;
            String str40 = block.ticket_type_title;
            if (str39 == null ? str40 != null : !str39.equals(str40)) {
                return false;
            }
            TicketType ticketType = this.ticket_type;
            TicketType ticketType2 = block.ticket_type;
            if (ticketType == null ? ticketType2 != null : !ticketType.equals(ticketType2)) {
                return false;
            }
            Link link = this.footerLink;
            Link link2 = block.footerLink;
            if (link != null) {
                return link.equals(link2);
            }
            if (link2 == null) {
                return true;
            }
        }
        return false;
    }

    public BlockAlignment getAlign() {
        return this.align;
    }

    public String getArticleId() {
        return this.articleId;
    }

    public List<BlockAttachment> getAttachments() {
        return this.attachments;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Map<String, String> getData() {
        return this.data;
    }

    public String getDescription() {
        return this.description;
    }

    public String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public Link getFooterLink() {
        return this.footerLink;
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.id;
    }

    public Image getImage() {
        return this.image;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public List<String> getItems() {
        return this.items;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public Uri getLocalUri() {
        return this.local_uri;
    }

    public List<ConversationRatingOption> getOptions() {
        return this.options;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getProvider() {
        return this.provider;
    }

    public int getRatingIndex() {
        return this.ratingIndex;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getText() {
        return this.text;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public TicketType getTicketType() {
        return this.ticket_type;
    }

    public long getTicketTypeId() {
        return this.ticketTypeId;
    }

    public String getTicketTypeTitle() {
        return this.ticket_type_title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public BlockType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        List<BlockAttachment> list = this.attachments;
        int i32 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i33 = i * 31;
        List<String> list2 = this.items;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i34 = (i33 + i2) * 31;
        Map<String, String> map = this.data;
        if (map != null) {
            i3 = map.hashCode();
        } else {
            i3 = 0;
        }
        int i35 = (i34 + i3) * 31;
        BlockType blockType = this.type;
        if (blockType != null) {
            i4 = blockType.hashCode();
        } else {
            i4 = 0;
        }
        int i36 = (i35 + i4) * 31;
        BlockAlignment blockAlignment = this.align;
        if (blockAlignment != null) {
            i5 = blockAlignment.hashCode();
        } else {
            i5 = 0;
        }
        int i37 = (i36 + i5) * 31;
        Author author = this.author;
        if (author != null) {
            i6 = author.hashCode();
        } else {
            i6 = 0;
        }
        int i38 = (i37 + i6) * 31;
        Image image = this.image;
        if (image != null) {
            i7 = image.hashCode();
        } else {
            i7 = 0;
        }
        int i39 = (i38 + i7) * 31;
        String str = this.text;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i40 = (i39 + i8) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i9 = str2.hashCode();
        } else {
            i9 = 0;
        }
        int i41 = (i40 + i9) * 31;
        String str3 = this.description;
        if (str3 != null) {
            i10 = str3.hashCode();
        } else {
            i10 = 0;
        }
        int i42 = (i41 + i10) * 31;
        String str4 = this.linkType;
        if (str4 != null) {
            i11 = str4.hashCode();
        } else {
            i11 = 0;
        }
        int i43 = (i42 + i11) * 31;
        String str5 = this.siteName;
        if (str5 != null) {
            i12 = str5.hashCode();
        } else {
            i12 = 0;
        }
        int i44 = (i43 + i12) * 31;
        String str6 = this.articleId;
        if (str6 != null) {
            i13 = str6.hashCode();
        } else {
            i13 = 0;
        }
        int i45 = (i44 + i13) * 31;
        String str7 = this.language;
        if (str7 != null) {
            i14 = str7.hashCode();
        } else {
            i14 = 0;
        }
        int i46 = (i45 + i14) * 31;
        String str8 = this.url;
        if (str8 != null) {
            i15 = str8.hashCode();
        } else {
            i15 = 0;
        }
        int i47 = (i46 + i15) * 31;
        String str9 = this.thumbnailUrl;
        if (str9 != null) {
            i16 = str9.hashCode();
        } else {
            i16 = 0;
        }
        int i48 = (i47 + i16) * 31;
        String str10 = this.previewUrl;
        if (str10 != null) {
            i17 = str10.hashCode();
        } else {
            i17 = 0;
        }
        int i49 = (i48 + i17) * 31;
        String str11 = this.attribution;
        if (str11 != null) {
            i18 = str11.hashCode();
        } else {
            i18 = 0;
        }
        int i50 = (i49 + i18) * 31;
        String str12 = this.linkUrl;
        if (str12 != null) {
            i19 = str12.hashCode();
        } else {
            i19 = 0;
        }
        int i51 = (i50 + i19) * 31;
        String str13 = this.trackingUrl;
        if (str13 != null) {
            i20 = str13.hashCode();
        } else {
            i20 = 0;
        }
        int i52 = (i51 + i20) * 31;
        String str14 = this.fallbackUrl;
        if (str14 != null) {
            i21 = str14.hashCode();
        } else {
            i21 = 0;
        }
        int i53 = (i52 + i21) * 31;
        String str15 = this.username;
        if (str15 != null) {
            i22 = str15.hashCode();
        } else {
            i22 = 0;
        }
        int i54 = (i53 + i22) * 31;
        String str16 = this.provider;
        if (str16 != null) {
            i23 = str16.hashCode();
        } else {
            i23 = 0;
        }
        int i55 = (i54 + i23) * 31;
        String str17 = this.id;
        if (str17 != null) {
            i24 = str17.hashCode();
        } else {
            i24 = 0;
        }
        int i56 = (((((((i55 + i24) * 31) + this.width) * 31) + this.height) * 31) + this.ratingIndex) * 31;
        String str18 = this.remark;
        if (str18 != null) {
            i25 = str18.hashCode();
        } else {
            i25 = 0;
        }
        int i57 = (i56 + i25) * 31;
        List<ConversationRatingOption> list3 = this.options;
        if (list3 != null) {
            i26 = list3.hashCode();
        } else {
            i26 = 0;
        }
        int i58 = (i57 + i26) * 31;
        List<Link> list4 = this.links;
        if (list4 != null) {
            i27 = list4.hashCode();
        } else {
            i27 = 0;
        }
        int i59 = (i58 + i27) * 31;
        Link link = this.footerLink;
        if (link != null) {
            i28 = link.hashCode();
        } else {
            i28 = 0;
        }
        int i60 = (i59 + i28) * 31;
        Uri uri = this.local_uri;
        if (uri != null) {
            i29 = uri.hashCode();
        } else {
            i29 = 0;
        }
        int i61 = (i60 + i29) * 31;
        String str19 = this.imageUrl;
        if (str19 != null) {
            i30 = str19.hashCode();
        } else {
            i30 = 0;
        }
        int i62 = (((((i61 + i30) * 31) + this.imageWidth) * 31) + this.imageHeight) * 31;
        String str20 = this.ticket_type_title;
        if (str20 != null) {
            i31 = str20.hashCode();
        } else {
            i31 = 0;
        }
        int i63 = (i62 + i31) * 31;
        TicketType ticketType = this.ticket_type;
        if (ticketType != null) {
            i32 = ticketType.hashCode();
        }
        return i63 + i32;
    }

    public Builder toBuilder() {
        String str;
        Builder builder = new Builder();
        int i = AnonymousClass2.$SwitchMap$io$intercom$android$sdk$blocks$lib$BlockType[this.type.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    return builder;
                }
                builder.withType(this.type.getSerializedName()).withAttachments(this.attachments);
                return builder;
            }
            Builder withLocalUri = builder.withType(this.type.getSerializedName()).withUrl(this.url).withLocalUri(this.local_uri);
            String str2 = null;
            if (this.attribution.isEmpty()) {
                str = null;
            } else {
                str = this.attribution;
            }
            Builder withAttribution = withLocalUri.withAttribution(str);
            if (!this.previewUrl.isEmpty()) {
                str2 = this.previewUrl;
            }
            withAttribution.withPreviewUrl(str2).withHeight(this.height).withWidth(this.width);
            return builder;
        }
        builder.withText(this.text).withType(this.type.getSerializedName());
        return builder;
    }

    public String toString() {
        return "Block{attachments=" + this.attachments + ", items=" + this.items + ", data=" + this.data + ", type=" + this.type + ", align=" + this.align + ", author=" + this.author + ", image=" + this.image + ", text='" + this.text + "', title='" + this.title + "', description='" + this.description + "', linkType='" + this.linkType + "', siteName='" + this.siteName + "', articleId='" + this.articleId + "', language='" + this.language + "', url='" + this.url + "', thumbnailUrl='" + this.thumbnailUrl + "', previewUrl='" + this.previewUrl + "', attribution='" + this.attribution + "', linkUrl='" + this.linkUrl + "', trackingUrl='" + this.trackingUrl + "', fallbackUrl='" + this.fallbackUrl + "', username='" + this.username + "', provider='" + this.provider + "', id='" + this.id + "', width=" + this.width + ", height=" + this.height + ", ratingIndex=" + this.ratingIndex + ", remark='" + this.remark + "', options=" + this.options + ", links=" + this.links + ", footerLink=" + this.footerLink + ", imageUrl=" + this.imageUrl + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", ticket_type_title=" + this.ticket_type_title + ", ticket_type=" + this.ticket_type + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        parcel.writeTypedList(this.attachments);
        parcel.writeStringList(this.items);
        parcel.writeInt(this.data.size());
        for (Map.Entry<String, String> entry : this.data.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        BlockType blockType = this.type;
        int i2 = -1;
        if (blockType == null) {
            ordinal = -1;
        } else {
            ordinal = blockType.ordinal();
        }
        parcel.writeInt(ordinal);
        BlockAlignment blockAlignment = this.align;
        if (blockAlignment != null) {
            i2 = blockAlignment.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.author, i);
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.linkType);
        parcel.writeString(this.siteName);
        parcel.writeString(this.articleId);
        parcel.writeString(this.language);
        parcel.writeString(this.url);
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.linkUrl);
        parcel.writeString(this.trackingUrl);
        parcel.writeString(this.fallbackUrl);
        parcel.writeString(this.username);
        parcel.writeString(this.provider);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.attribution);
        parcel.writeString(this.id);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.duration);
        parcel.writeInt(this.ratingIndex);
        parcel.writeString(this.remark);
        parcel.writeTypedList(this.options);
        parcel.writeTypedList(this.links);
        parcel.writeParcelable(this.footerLink, i);
        parcel.writeParcelable(this.local_uri, i);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.imageWidth);
        parcel.writeInt(this.imageHeight);
        parcel.writeString(this.ticket_type_title);
        parcel.writeParcelable(this.ticket_type, i);
    }

    public Block() {
        this(new Builder());
    }

    public /* synthetic */ Block(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }

    public Block(Parcel parcel) {
        this.attachments = parcel.createTypedArrayList(BlockAttachment.CREATOR);
        this.items = parcel.createStringArrayList();
        int readInt = parcel.readInt();
        this.data = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.data.put(parcel.readString(), parcel.readString());
        }
        int readInt2 = parcel.readInt();
        this.type = readInt2 == -1 ? null : BlockType.values()[readInt2];
        int readInt3 = parcel.readInt();
        this.align = readInt3 != -1 ? BlockAlignment.values()[readInt3] : null;
        this.author = (Author) parcel.readParcelable(Author.class.getClassLoader());
        this.image = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.linkType = parcel.readString();
        this.siteName = parcel.readString();
        this.articleId = parcel.readString();
        this.language = parcel.readString();
        this.url = parcel.readString();
        this.thumbnailUrl = parcel.readString();
        this.linkUrl = parcel.readString();
        this.trackingUrl = parcel.readString();
        this.fallbackUrl = parcel.readString();
        this.username = parcel.readString();
        this.provider = parcel.readString();
        this.previewUrl = parcel.readString();
        this.attribution = parcel.readString();
        this.id = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.duration = parcel.readLong();
        this.ratingIndex = parcel.readInt();
        this.remark = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.options = arrayList;
        parcel.readList(arrayList, ConversationRatingOption.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.links = arrayList2;
        parcel.readList(arrayList2, Link.class.getClassLoader());
        this.footerLink = (Link) parcel.readParcelable(Link.class.getClassLoader());
        this.local_uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.imageUrl = parcel.readString();
        this.imageWidth = parcel.readInt();
        this.imageHeight = parcel.readInt();
        this.ticket_type_title = parcel.readString();
        this.ticket_type = (TicketType) parcel.readParcelable(TicketType.class.getClassLoader());
    }
}
