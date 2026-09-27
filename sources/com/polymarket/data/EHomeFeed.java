package com.polymarket.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u0017\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\b\u0010\rJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u00020\u00132\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010\u001e\u001a\u00060\u0004j\u0002`\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082 J\u001b\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010%\u001a\u0004\u0018\u00010\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010(\u001a\u0004\u0018\u00010\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00101\u001a\u0004\u0018\u00010\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00104\u001a\u0004\u0018\u00010\f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u00107\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001b\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180?2\u0006\u0010@\u001a\u00020\u001aH\u0016J\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00180?2\u0006\u0010@\u001a\u00020\u001aH\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0013\u0010\"\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010&\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b'\u0010$R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001cR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001cR\u0013\u0010/\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b0\u0010$R\u0013\u00102\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b3\u0010$R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b6\u0010\u001cR\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010\u001cR\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b<\u0010\u001c¨\u0006C"}, d2 = {"Lcom/polymarket/data/EHomeFeed;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "sections", "", "Lcom/polymarket/data/EHomeSection;", "(Ljava/util/List;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getSections", "()Ljava/util/List;", "Swift_sections", "Swift_constructor_0", "sortedSections", "getSortedSections", "Swift_sortedSections", "trendingSection", "getTrendingSection", "()Lcom/polymarket/data/EHomeSection;", "Swift_trendingSection", "liveSection", "getLiveSection", "Swift_liveSection", "sportSections", "getSportSections", "Swift_sportSections", "featuredSections", "getFeaturedSections", "Swift_featuredSections", "categoriesSection", "getCategoriesSection", "Swift_categoriesSection", "positionsSection", "getPositionsSection", "Swift_positionsSection", "tagSections", "getTagSections", "Swift_tagSections", "tournamentCalloutSections", "getTournamentCalloutSections", "Swift_tournamentCalloutSections", "hubCalloutSections", "getHubCalloutSections", "Swift_hubCalloutSections", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EHomeFeed implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public EHomeFeed(List<EHomeSection> list) {
        list.getClass();
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(list);
    }

    private final native EHomeSection Swift_categoriesSection(long Swift_peer);

    private final native long Swift_constructor_0(List<EHomeSection> sections);

    private final native List<EHomeSection> Swift_featuredSections(long Swift_peer);

    private final native List<EHomeSection> Swift_hubCalloutSections(long Swift_peer);

    private final native EHomeSection Swift_liveSection(long Swift_peer);

    private final native EHomeSection Swift_positionsSection(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native List<EHomeSection> Swift_sections(long Swift_peer);

    private final native List<EHomeSection> Swift_sortedSections(long Swift_peer);

    private final native List<EHomeSection> Swift_sportSections(long Swift_peer);

    private final native List<EHomeSection> Swift_tagSections(long Swift_peer);

    private final native List<EHomeSection> Swift_tournamentCalloutSections(long Swift_peer);

    private final native EHomeSection Swift_trendingSection(long Swift_peer);

    @Override // skip.bridge.SwiftPeerBridged
    /* renamed from: Swift_peer, reason: from getter */
    public long getSwift_peer() {
        return this.Swift_peer;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public boolean equals(Object other) {
        if (!(other instanceof SwiftPeerBridged) || this.Swift_peer != ((SwiftPeerBridged) other).getSwift_peer()) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        Swift_release(this.Swift_peer);
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
    }

    public final EHomeSection getCategoriesSection() {
        return Swift_categoriesSection(this.Swift_peer);
    }

    public final List<EHomeSection> getFeaturedSections() {
        return Swift_featuredSections(this.Swift_peer);
    }

    public final List<EHomeSection> getHubCalloutSections() {
        return Swift_hubCalloutSections(this.Swift_peer);
    }

    public final EHomeSection getLiveSection() {
        return Swift_liveSection(this.Swift_peer);
    }

    public final EHomeSection getPositionsSection() {
        return Swift_positionsSection(this.Swift_peer);
    }

    public final List<EHomeSection> getSections() {
        return Swift_sections(this.Swift_peer);
    }

    public final List<EHomeSection> getSortedSections() {
        return Swift_sortedSections(this.Swift_peer);
    }

    public final List<EHomeSection> getSportSections() {
        return Swift_sportSections(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public final List<EHomeSection> getTagSections() {
        return Swift_tagSections(this.Swift_peer);
    }

    public final List<EHomeSection> getTournamentCalloutSections() {
        return Swift_tournamentCalloutSections(this.Swift_peer);
    }

    public final EHomeSection getTrendingSection() {
        return Swift_trendingSection(this.Swift_peer);
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public EHomeFeed(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
