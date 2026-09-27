package io.intercom.android.sdk.helpcenter.sections;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.dqn;
import defpackage.dxg;
import defpackage.exg;
import defpackage.gxg;
import defpackage.hdi;
import defpackage.hm6;
import defpackage.sv6;
import defpackage.woa;
import defpackage.yk0;
import defpackage.yq4;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection$$serializer;
import io.radar.sdk.RadarTrackingOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@exg
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006¢\u0006\u0004\b\u0011\u0010\u0012B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJx\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006HÇ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\rH×\u0001¢\u0006\u0004\b%\u0010 J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010\u0018R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\b=\u00106\u001a\u0004\b<\u0010\u001cR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010;\u0012\u0004\b?\u00106\u001a\u0004\b>\u0010\u001cR&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010;\u0012\u0004\bA\u00106\u001a\u0004\b@\u0010\u001cR \u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010B\u0012\u0004\bD\u00106\u001a\u0004\bC\u0010 R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010;\u0012\u0004\bF\u00106\u001a\u0004\bE\u0010\u001c¨\u0006I"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "", "", "collectionId", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "summary", "", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterArticle;", "helpCenterArticles", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterSection;", "helpCenterSections", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "subCollections", "", "articlesCount", "Lio/intercom/android/sdk/helpcenter/sections/Author;", "authors", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;)V", "seen0", "Lgxg;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;Lgxg;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()I", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;ILjava/util/List;)Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lyq4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$intercom_sdk_base_release", "(Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;Lyq4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getCollectionId", "getCollectionId$annotations", "()V", "getTitle", "getTitle$annotations", "getSummary", "getSummary$annotations", "Ljava/util/List;", "getHelpCenterArticles", "getHelpCenterArticles$annotations", "getHelpCenterSections", "getHelpCenterSections$annotations", "getSubCollections", "getSubCollections$annotations", "I", "getArticlesCount", "getArticlesCount$annotations", "getAuthors", "getAuthors$annotations", "Companion", "$serializer", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class HelpCenterCollectionContent {
    private final int articlesCount;
    private final List<Author> authors;
    private final String collectionId;
    private final List<HelpCenterArticle> helpCenterArticles;
    private final List<HelpCenterSection> helpCenterSections;
    private final List<HelpCenterCollection> subCollections;
    private final String summary;
    private final String title;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer[] $childSerializers = {null, null, null, new yk0(HelpCenterArticle$$serializer.INSTANCE, 0), new yk0(HelpCenterSection$$serializer.INSTANCE, 0), new yk0(HelpCenterCollection$$serializer.INSTANCE, 0), null, new yk0(Author$$serializer.INSTANCE, 0)};

    public /* synthetic */ HelpCenterCollectionContent(int i, String str, String str2, String str3, List list, List list2, List list3, int i2, List list4, gxg gxgVar) {
        if (65 == (i & 65)) {
            this.collectionId = str;
            if ((i & 2) == 0) {
                this.title = "";
            } else {
                this.title = str2;
            }
            if ((i & 4) == 0) {
                this.summary = "";
            } else {
                this.summary = str3;
            }
            if ((i & 8) == 0) {
                this.helpCenterArticles = CollectionsKt.emptyList();
            } else {
                this.helpCenterArticles = list;
            }
            if ((i & 16) == 0) {
                this.helpCenterSections = CollectionsKt.emptyList();
            } else {
                this.helpCenterSections = list2;
            }
            if ((i & 32) == 0) {
                this.subCollections = CollectionsKt.emptyList();
            } else {
                this.subCollections = list3;
            }
            this.articlesCount = i2;
            if ((i & 128) == 0) {
                this.authors = CollectionsKt.emptyList();
                return;
            } else {
                this.authors = list4;
                return;
            }
        }
        dqn.d(i, 65, HelpCenterCollectionContent$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public static final /* synthetic */ KSerializer[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ HelpCenterCollectionContent copy$default(HelpCenterCollectionContent helpCenterCollectionContent, String str, String str2, String str3, List list, List list2, List list3, int i, List list4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = helpCenterCollectionContent.collectionId;
        }
        if ((i2 & 2) != 0) {
            str2 = helpCenterCollectionContent.title;
        }
        if ((i2 & 4) != 0) {
            str3 = helpCenterCollectionContent.summary;
        }
        if ((i2 & 8) != 0) {
            list = helpCenterCollectionContent.helpCenterArticles;
        }
        if ((i2 & 16) != 0) {
            list2 = helpCenterCollectionContent.helpCenterSections;
        }
        if ((i2 & 32) != 0) {
            list3 = helpCenterCollectionContent.subCollections;
        }
        if ((i2 & 64) != 0) {
            i = helpCenterCollectionContent.articlesCount;
        }
        if ((i2 & 128) != 0) {
            list4 = helpCenterCollectionContent.authors;
        }
        int i3 = i;
        List list5 = list4;
        List list6 = list2;
        List list7 = list3;
        return helpCenterCollectionContent.copy(str, str2, str3, list, list6, list7, i3, list5);
    }

    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(HelpCenterCollectionContent self, yq4 output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.A(serialDesc, 0, self.collectionId);
        if (output.r(serialDesc) || !Intrinsics.areEqual(self.title, "")) {
            output.A(serialDesc, 1, self.title);
        }
        if (output.r(serialDesc) || !Intrinsics.areEqual(self.summary, "")) {
            output.A(serialDesc, 2, self.summary);
        }
        if (output.r(serialDesc) || !Intrinsics.areEqual(self.helpCenterArticles, CollectionsKt.emptyList())) {
            output.f(serialDesc, 3, kSerializerArr[3], self.helpCenterArticles);
        }
        if (output.r(serialDesc) || !Intrinsics.areEqual(self.helpCenterSections, CollectionsKt.emptyList())) {
            output.f(serialDesc, 4, kSerializerArr[4], self.helpCenterSections);
        }
        if (output.r(serialDesc) || !Intrinsics.areEqual(self.subCollections, CollectionsKt.emptyList())) {
            output.f(serialDesc, 5, kSerializerArr[5], self.subCollections);
        }
        output.w(6, self.articlesCount, serialDesc);
        if (output.r(serialDesc) || !Intrinsics.areEqual(self.authors, CollectionsKt.emptyList())) {
            output.f(serialDesc, 7, kSerializerArr[7], self.authors);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final String getCollectionId() {
        return this.collectionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final List<HelpCenterArticle> component4() {
        return this.helpCenterArticles;
    }

    public final List<HelpCenterSection> component5() {
        return this.helpCenterSections;
    }

    public final List<HelpCenterCollection> component6() {
        return this.subCollections;
    }

    /* renamed from: component7, reason: from getter */
    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final List<Author> component8() {
        return this.authors;
    }

    public final HelpCenterCollectionContent copy(String collectionId, String title, String summary, List<HelpCenterArticle> helpCenterArticles, List<HelpCenterSection> helpCenterSections, List<HelpCenterCollection> subCollections, int articlesCount, List<Author> authors) {
        collectionId.getClass();
        title.getClass();
        summary.getClass();
        helpCenterArticles.getClass();
        helpCenterSections.getClass();
        subCollections.getClass();
        authors.getClass();
        return new HelpCenterCollectionContent(collectionId, title, summary, helpCenterArticles, helpCenterSections, subCollections, articlesCount, authors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpCenterCollectionContent)) {
            return false;
        }
        HelpCenterCollectionContent helpCenterCollectionContent = (HelpCenterCollectionContent) other;
        if (Intrinsics.areEqual(this.collectionId, helpCenterCollectionContent.collectionId) && Intrinsics.areEqual(this.title, helpCenterCollectionContent.title) && Intrinsics.areEqual(this.summary, helpCenterCollectionContent.summary) && Intrinsics.areEqual(this.helpCenterArticles, helpCenterCollectionContent.helpCenterArticles) && Intrinsics.areEqual(this.helpCenterSections, helpCenterCollectionContent.helpCenterSections) && Intrinsics.areEqual(this.subCollections, helpCenterCollectionContent.subCollections) && this.articlesCount == helpCenterCollectionContent.articlesCount && Intrinsics.areEqual(this.authors, helpCenterCollectionContent.authors)) {
            return true;
        }
        return false;
    }

    public final int getArticlesCount() {
        return this.articlesCount;
    }

    public final List<Author> getAuthors() {
        return this.authors;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final List<HelpCenterArticle> getHelpCenterArticles() {
        return this.helpCenterArticles;
    }

    public final List<HelpCenterSection> getHelpCenterSections() {
        return this.helpCenterSections;
    }

    public final List<HelpCenterCollection> getSubCollections() {
        return this.subCollections;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.authors.hashCode() + woa.b(this.articlesCount, hdi.f(hdi.f(hdi.f(hdi.e(hdi.e(this.collectionId.hashCode() * 31, 31, this.title), 31, this.summary), 31, this.helpCenterArticles), 31, this.helpCenterSections), 31, this.subCollections), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HelpCenterCollectionContent(collectionId=");
        sb.append(this.collectionId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", summary=");
        sb.append(this.summary);
        sb.append(", helpCenterArticles=");
        sb.append(this.helpCenterArticles);
        sb.append(", helpCenterSections=");
        sb.append(this.helpCenterSections);
        sb.append(", subCollections=");
        sb.append(this.subCollections);
        sb.append(", articlesCount=");
        sb.append(this.articlesCount);
        sb.append(", authors=");
        return sv6.r(sb, this.authors, ')');
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return HelpCenterCollectionContent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @dxg("article_count")
    public static /* synthetic */ void getArticlesCount$annotations() {
    }

    @dxg("authors")
    public static /* synthetic */ void getAuthors$annotations() {
    }

    @dxg(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)
    public static /* synthetic */ void getCollectionId$annotations() {
    }

    @dxg("articles")
    public static /* synthetic */ void getHelpCenterArticles$annotations() {
    }

    @hm6
    @dxg("sections")
    public static /* synthetic */ void getHelpCenterSections$annotations() {
    }

    @dxg("collections")
    public static /* synthetic */ void getSubCollections$annotations() {
    }

    @dxg("description")
    public static /* synthetic */ void getSummary$annotations() {
    }

    @dxg(Keys.KEY_NAME)
    public static /* synthetic */ void getTitle$annotations() {
    }

    public HelpCenterCollectionContent(String str, String str2, String str3, List<HelpCenterArticle> list, List<HelpCenterSection> list2, List<HelpCenterCollection> list3, int i, List<Author> list4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.collectionId = str;
        this.title = str2;
        this.summary = str3;
        this.helpCenterArticles = list;
        this.helpCenterSections = list2;
        this.subCollections = list3;
        this.articlesCount = i;
        this.authors = list4;
    }

    public /* synthetic */ HelpCenterCollectionContent(String str, String str2, String str3, List list, List list2, List list3, int i, List list4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list3, i, (i2 & 128) != 0 ? CollectionsKt.emptyList() : list4);
    }
}
