package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.woa;
import io.intercom.android.sdk.blocks.lib.BlockType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class Link implements Parcelable {
    public static final Parcelable.Creator<Link> CREATOR = new Parcelable.Creator<Link>() { // from class: io.intercom.android.sdk.blocks.lib.models.Link.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Link createFromParcel(Parcel parcel) {
            return new Link(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Link[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Link[] newArray(int i) {
            return new Link[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Link createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }
    };
    private final String articleId;
    private final Author author;
    private final Map<String, String> data;
    private final String description;
    private final Image image;
    private final String linkType;
    private final String siteName;
    private final String text;
    private final String title;
    private final BlockType type;
    private final String url;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes6.dex */
    public static final class Builder {
        String articleId;
        Author author;
        Map<String, String> data;
        String description;
        Image image;
        String linkType;
        String siteName;
        String text;
        String title;
        String type;
        String url;

        public Link build() {
            return new Link(this, null);
        }

        public Builder withArticleId(String str) {
            this.articleId = str;
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

        public Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Builder withLinkType(String str) {
            this.linkType = str;
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
    }

    public Link(Parcel parcel) {
        this.type = BlockType.typeValueOf(parcel.readString());
        this.text = parcel.readString();
        this.title = parcel.readString();
        this.description = parcel.readString();
        this.linkType = parcel.readString();
        this.siteName = parcel.readString();
        this.articleId = parcel.readString();
        this.url = parcel.readString();
        this.author = (Author) parcel.readParcelable(Author.class.getClassLoader());
        this.image = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.data = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.data.put(parcel.readString(), parcel.readString());
        }
    }

    public static Link fromBlock(Block block) {
        if (block == null) {
            return new Link();
        }
        Builder builder = new Builder();
        builder.type = block.getType().name();
        builder.text = block.getText();
        builder.title = block.getTitle();
        builder.description = block.getDescription();
        builder.linkType = block.getLinkType();
        builder.author = block.getAuthor();
        builder.image = block.getImage();
        builder.data = block.getData();
        builder.siteName = block.getSiteName();
        builder.articleId = block.getArticleId();
        builder.url = block.getUrl();
        return new Link(builder);
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
            Link link = (Link) obj;
            if (this.type != link.type) {
                return false;
            }
            String str = this.text;
            String str2 = link.text;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            String str3 = this.title;
            String str4 = link.title;
            if (str3 == null ? str4 != null : !str3.equals(str4)) {
                return false;
            }
            String str5 = this.description;
            String str6 = link.description;
            if (str5 == null ? str6 != null : !str5.equals(str6)) {
                return false;
            }
            String str7 = this.linkType;
            String str8 = link.linkType;
            if (str7 == null ? str8 != null : !str7.equals(str8)) {
                return false;
            }
            Author author = this.author;
            Author author2 = link.author;
            if (author == null ? author2 != null : !author.equals(author2)) {
                return false;
            }
            Image image = this.image;
            Image image2 = link.image;
            if (image == null ? image2 != null : !image.equals(image2)) {
                return false;
            }
            Map<String, String> map = this.data;
            Map<String, String> map2 = link.data;
            if (map == null ? map2 != null : !map.equals(map2)) {
                return false;
            }
            String str9 = this.siteName;
            String str10 = link.siteName;
            if (str9 == null ? str10 != null : !str9.equals(str10)) {
                return false;
            }
            String str11 = this.articleId;
            String str12 = link.articleId;
            if (str11 == null ? str12 != null : !str11.equals(str12)) {
                return false;
            }
            String str13 = this.url;
            String str14 = link.url;
            if (str13 != null) {
                return str13.equals(str14);
            }
            if (str14 == null) {
                return true;
            }
        }
        return false;
    }

    public String getArticleId() {
        return this.articleId;
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

    public Image getImage() {
        return this.image;
    }

    public String getLinkType() {
        return this.linkType;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public BlockType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
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
        BlockType blockType = this.type;
        int i11 = 0;
        if (blockType != null) {
            i = blockType.hashCode();
        } else {
            i = 0;
        }
        int i12 = i * 31;
        String str = this.text;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 31;
        String str2 = this.title;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        String str3 = this.description;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 31;
        String str4 = this.linkType;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        Author author = this.author;
        if (author != null) {
            i6 = author.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 31;
        Image image = this.image;
        if (image != null) {
            i7 = image.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        Map<String, String> map = this.data;
        if (map != null) {
            i8 = map.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        String str5 = this.siteName;
        if (str5 != null) {
            i9 = str5.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        String str6 = this.articleId;
        if (str6 != null) {
            i10 = str6.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 31;
        String str7 = this.url;
        if (str7 != null) {
            i11 = str7.hashCode();
        }
        return i21 + i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LinkCard{type=");
        sb.append(this.type);
        sb.append(", text='");
        sb.append(this.text);
        sb.append("', title='");
        sb.append(this.title);
        sb.append("', description='");
        sb.append(this.description);
        sb.append("', linkType='");
        sb.append(this.linkType);
        sb.append("', author=");
        sb.append(this.author);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", siteName='");
        sb.append(this.siteName);
        sb.append("', articleId='");
        sb.append(this.articleId);
        sb.append("', url='");
        return woa.r(sb, this.url, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type.name());
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.linkType);
        parcel.writeString(this.siteName);
        parcel.writeString(this.articleId);
        parcel.writeString(this.url);
        parcel.writeParcelable(this.author, i);
        parcel.writeParcelable(this.image, i);
        parcel.writeInt(this.data.size());
        for (Map.Entry<String, String> entry : this.data.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public Link() {
        this(new Builder());
    }

    private Link(Builder builder) {
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
        this.data = map == null ? new HashMap<>() : map;
        String str7 = builder.url;
        this.url = str7 != null ? str7 : "";
    }

    public /* synthetic */ Link(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }
}
