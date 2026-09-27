package com.polymarket.clients;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.bridge.BridgeSupportKt;
import skip.bridge.SwiftPeerBridged;
import skip.bridge.SwiftPeerMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u001f\b\u0016\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB}\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\u0017J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u001d2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\f\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\u0017\u0010'\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010)\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010+\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u001d\u0010.\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00100\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00102\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00104\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00106\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u00108\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010:\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0017\u0010<\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005H\u0082 J\u0081\u0001\u0010=\u001a\u00060\u0004j\u0002`\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bH\u0082 J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\"0?2\u0006\u0010@\u001a\u00020$H\u0016J\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\"0?2\u0006\u0010@\u001a\u00020$H\u0082 R\u001e\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b3\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010&R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b9\u0010&R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b;\u0010&¨\u0006C"}, d2 = {"Lcom/polymarket/clients/ClientPlatformPayBillingContact;", "Lskip/bridge/SwiftPeerBridged;", "Lskip/lib/SwiftProjecting;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", "givenName", "", "familyName", "street", "addressLines", "", "subLocality", "city", "subAdministrativeArea", "state", "postalCode", "country", "countryCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSwift_peer", "()J", "setSwift_peer", "(J)V", "finalize", "", "Swift_release", "equals", "", "other", "", "hashCode", "", "getGivenName", "()Ljava/lang/String;", "Swift_givenName", "getFamilyName", "Swift_familyName", "getStreet", "Swift_street", "getAddressLines", "()Ljava/util/List;", "Swift_addressLines", "getSubLocality", "Swift_subLocality", "getCity", "Swift_city", "getSubAdministrativeArea", "Swift_subAdministrativeArea", "getState", "Swift_state", "getPostalCode", "Swift_postalCode", "getCountry", "Swift_country", "getCountryCode", "Swift_countryCode", "Swift_constructor_0", "Swift_projection", "Lkotlin/Function0;", "options", "Swift_projectionImpl", "Companion", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientPlatformPayBillingContact implements SwiftPeerBridged, SwiftProjecting {
    private long Swift_peer;

    public ClientPlatformPayBillingContact(String str, String str2, String str3, List<String> list, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.Swift_peer = BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = Swift_constructor_0(str, str2, str3, list, str4, str5, str6, str7, str8, str9, str10);
    }

    private final native List<String> Swift_addressLines(long Swift_peer);

    private final native String Swift_city(long Swift_peer);

    private final native long Swift_constructor_0(String givenName, String familyName, String street, List<String> addressLines, String subLocality, String city, String subAdministrativeArea, String state, String postalCode, String country, String countryCode);

    private final native String Swift_country(long Swift_peer);

    private final native String Swift_countryCode(long Swift_peer);

    private final native String Swift_familyName(long Swift_peer);

    private final native String Swift_givenName(long Swift_peer);

    private final native String Swift_postalCode(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native void Swift_release(long Swift_peer);

    private final native String Swift_state(long Swift_peer);

    private final native String Swift_street(long Swift_peer);

    private final native String Swift_subAdministrativeArea(long Swift_peer);

    private final native String Swift_subLocality(long Swift_peer);

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

    public final List<String> getAddressLines() {
        return Swift_addressLines(this.Swift_peer);
    }

    public final String getCity() {
        return Swift_city(this.Swift_peer);
    }

    public final String getCountry() {
        return Swift_country(this.Swift_peer);
    }

    public final String getCountryCode() {
        return Swift_countryCode(this.Swift_peer);
    }

    public final String getFamilyName() {
        return Swift_familyName(this.Swift_peer);
    }

    public final String getGivenName() {
        return Swift_givenName(this.Swift_peer);
    }

    public final String getPostalCode() {
        return Swift_postalCode(this.Swift_peer);
    }

    public final String getState() {
        return Swift_state(this.Swift_peer);
    }

    public final String getStreet() {
        return Swift_street(this.Swift_peer);
    }

    public final String getSubAdministrativeArea() {
        return Swift_subAdministrativeArea(this.Swift_peer);
    }

    public final String getSubLocality() {
        return Swift_subLocality(this.Swift_peer);
    }

    public final long getSwift_peer() {
        return this.Swift_peer;
    }

    public int hashCode() {
        return Long.hashCode(this.Swift_peer);
    }

    public final void setSwift_peer(long j) {
        this.Swift_peer = j;
    }

    public ClientPlatformPayBillingContact(long j, SwiftPeerMarker swiftPeerMarker) {
        BridgeSupportKt.getSwiftObjectNil();
        this.Swift_peer = j;
    }
}
