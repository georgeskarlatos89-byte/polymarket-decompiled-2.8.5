package com.polymarket.usviewmodels;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.polymarket.clients.ClientAnalyticsInput;
import com.polymarket.data.APIAddress;
import com.polymarket.data.EAmericanState;
import com.polymarket.data.ECountry;
import com.polymarket.data.TextFieldConfig;
import com.polymarket.usviewmodels.AppViewModel;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.b0;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.radar.sdk.RadarTrackingOptions;
import io.radar.sdk.RadarTripOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.bridge.SwiftPeerMarker;
import skip.lib.Array;
import skip.lib.ArrayKt;
import skip.lib.CaseIterable;
import skip.lib.CaseIterableCompanion;
import skip.lib.StructKt;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 ª\u00012\u00020\u0001:\f¥\u0001¦\u0001§\u0001¨\u0001©\u0001ª\u0001B\u001f\b\u0016\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bBI\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0007\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\f2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\u001b\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020\fH\u0082 J\u0015\u0010!\u001a\u00020\u000e2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010\"\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020\u000eH\u0082 J\u0015\u0010(\u001a\u00020\u00102\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010)\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020\u0010H\u0082 J\u0015\u0010/\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u00100\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020*H\u0082 J\u001b\u00108\u001a\b\u0012\u0004\u0012\u000202012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u00109\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020201H\u0082 J\u001b\u0010=\u001a\b\u0012\u0004\u0012\u000202012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010>\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020201H\u0082 J\u001b\u0010B\u001a\b\u0012\u0004\u0012\u000202012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010C\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020201H\u0082 J\u001b\u0010G\u001a\b\u0012\u0004\u0012\u000202012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010H\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020201H\u0082 J\u001b\u0010L\u001a\b\u0012\u0004\u0012\u000202012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010M\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020201H\u0082 J\u0017\u0010T\u001a\u0004\u0018\u00010N2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001f\u0010U\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010NH\u0082 J\u0015\u0010X\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010Y\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020*H\u0082 J\u001b\u0010]\u001a\b\u0012\u0004\u0012\u000202012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010^\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020201H\u0082 J\u001b\u0010f\u001a\b\u0012\u0004\u0012\u00020`0_2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010g\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020`0_H\u0082 J\u0015\u0010j\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010k\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020*H\u0082 J\u0015\u0010n\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001d\u0010o\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020*H\u0082 J\u001b\u0010t\u001a\b\u0012\u0004\u0012\u00020p0_2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J#\u0010u\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020p0_H\u0082 J\u0015\u0010z\u001a\u00020w2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0081\u0001\u001a\u00020{2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u001e\u0010\u0082\u0001\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u001c\u001a\u00020{H\u0082 J\u0016\u0010\u0085\u0001\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0088\u0001\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008b\u0001\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u008f\u0001\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0092\u0001\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0095\u0001\u001a\u0002022\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0016\u0010\u0098\u0001\u001a\u00020*2\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\t\u0010\u0099\u0001\u001a\u00020\u0013H\u0016J\u0016\u0010\u009a\u0001\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u0082 J\u0011\u0010\u009b\u0001\u001a\u00020\u00132\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001J \u0010\u009e\u0001\u001a\u00020\u00132\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001H\u0082 J\u001b\u0010\u009f\u0001\u001a\n\u0012\u0005\u0012\u00030¡\u00010 \u00012\b\u0010¢\u0001\u001a\u00030£\u0001H\u0016J\u001c\u0010¤\u0001\u001a\n\u0012\u0005\u0012\u00030¡\u00010 \u00012\b\u0010¢\u0001\u001a\u00030£\u0001H\u0082 R$\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010#\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010+\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R0\u00103\u001a\b\u0012\u0004\u0012\u000202012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u000202018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R0\u0010:\u001a\b\u0012\u0004\u0012\u000202012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u000202018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00105\"\u0004\b<\u00107R0\u0010?\u001a\b\u0012\u0004\u0012\u000202012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u000202018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b@\u00105\"\u0004\bA\u00107R0\u0010D\u001a\b\u0012\u0004\u0012\u000202012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u000202018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u00105\"\u0004\bF\u00107R0\u0010I\u001a\b\u0012\u0004\u0012\u000202012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u000202018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u00105\"\u0004\bK\u00107R(\u0010O\u001a\u0004\u0018\u00010N2\b\u0010\u0015\u001a\u0004\u0018\u00010N8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010V\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010,\"\u0004\bW\u0010.R0\u0010Z\u001a\b\u0012\u0004\u0012\u000202012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u000202018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u00105\"\u0004\b\\\u00107R0\u0010a\u001a\b\u0012\u0004\u0012\u00020`0_2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020`0_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR$\u0010h\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010,\"\u0004\bi\u0010.R$\u0010l\u001a\u00020*2\u0006\u0010\u0015\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010,\"\u0004\bm\u0010.R0\u0010q\u001a\b\u0012\u0004\u0012\u00020p0_2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020p0_8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010c\"\u0004\bs\u0010eR\u0011\u0010v\u001a\u00020w8F¢\u0006\u0006\u001a\u0004\bx\u0010yR%\u0010|\u001a\u00020{2\u0006\u0010\u0015\u001a\u00020{8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0013\u0010\u0083\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010,R\u0013\u0010\u0086\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010,R\u0013\u0010\u0089\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010,R\u0014\u0010\u008c\u0001\u001a\u0002028F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0014\u0010\u0090\u0001\u001a\u0002028F¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u008e\u0001R\u0014\u0010\u0093\u0001\u001a\u0002028F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u008e\u0001R\u0013\u0010\u0096\u0001\u001a\u00020*8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010,¨\u0006«\u0001"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel;", "Lcom/polymarket/usviewmodels/AppViewModel;", "Swift_peer", "", "Lskip/bridge/SwiftObjectPointer;", "marker", "Lskip/bridge/SwiftPeerMarker;", "<init>", "(JLskip/bridge/SwiftPeerMarker;)V", PlaceTypes.ADDRESS, "Lcom/polymarket/data/APIAddress;", "context", "Lcom/polymarket/usviewmodels/AddressViewModel$Context;", RadarTripOptions.KEY_MODE, "Lcom/polymarket/usviewmodels/AddressViewModel$Mode;", "initialViewMode", "Lcom/polymarket/usviewmodels/AddressViewModel$ViewMode;", "onAddressEntered", "Lkotlin/Function1;", "", "(Lcom/polymarket/data/APIAddress;Lcom/polymarket/usviewmodels/AddressViewModel$Context;Lcom/polymarket/usviewmodels/AddressViewModel$Mode;Lcom/polymarket/usviewmodels/AddressViewModel$ViewMode;Lkotlin/jvm/functions/Function1;)V", "newValue", "getContext", "()Lcom/polymarket/usviewmodels/AddressViewModel$Context;", "setContext", "(Lcom/polymarket/usviewmodels/AddressViewModel$Context;)V", "Swift_context", "Swift_context_set", "value", "getMode", "()Lcom/polymarket/usviewmodels/AddressViewModel$Mode;", "setMode", "(Lcom/polymarket/usviewmodels/AddressViewModel$Mode;)V", "Swift_mode", "Swift_mode_set", "viewMode", "getViewMode", "()Lcom/polymarket/usviewmodels/AddressViewModel$ViewMode;", "setViewMode", "(Lcom/polymarket/usviewmodels/AddressViewModel$ViewMode;)V", "Swift_viewMode", "Swift_viewMode_set", "", "isSearchExpanded", "()Z", "setSearchExpanded", "(Z)V", "Swift_isSearchExpanded", "Swift_isSearchExpanded_set", "Lcom/polymarket/data/TextFieldConfig;", "", "address1Text", "getAddress1Text", "()Lcom/polymarket/data/TextFieldConfig;", "setAddress1Text", "(Lcom/polymarket/data/TextFieldConfig;)V", "Swift_address1Text", "Swift_address1Text_set", "address2Text", "getAddress2Text", "setAddress2Text", "Swift_address2Text", "Swift_address2Text_set", "cityText", "getCityText", "setCityText", "Swift_cityText", "Swift_cityText_set", "zipcodeText", "getZipcodeText", "setZipcodeText", "Swift_zipcodeText", "Swift_zipcodeText_set", "stateText", "getStateText", "setStateText", "Swift_stateText", "Swift_stateText_set", "Lcom/polymarket/data/EAmericanState;", "selectedState", "getSelectedState", "()Lcom/polymarket/data/EAmericanState;", "setSelectedState", "(Lcom/polymarket/data/EAmericanState;)V", "Swift_selectedState", "Swift_selectedState_set", "isLoading", "setLoading", "Swift_isLoading", "Swift_isLoading_set", "searchQueryText", "getSearchQueryText", "setSearchQueryText", "Swift_searchQueryText", "Swift_searchQueryText_set", "", "Lcom/polymarket/data/APIAddress$SearchResult;", "searchResults", "getSearchResults", "()Ljava/util/List;", "setSearchResults", "(Ljava/util/List;)V", "Swift_searchResults", "Swift_searchResults_set", "isSearching", "setSearching", "Swift_isSearching", "Swift_isSearching_set", "isAnyFieldFocused", "setAnyFieldFocused", "Swift_isAnyFieldFocused", "Swift_isAnyFieldFocused_set", "Lcom/polymarket/usviewmodels/KYCFieldFocus;", "formFieldOrder", "getFormFieldOrder", "setFormFieldOrder", "Swift_formFieldOrder", "Swift_formFieldOrder_set", "country", "Lcom/polymarket/data/ECountry;", "getCountry", "()Lcom/polymarket/data/ECountry;", "Swift_country", "", "searchScrollOffset", "getSearchScrollOffset", "()D", "setSearchScrollOffset", "(D)V", "Swift_searchScrollOffset", "Swift_searchScrollOffset_set", "noSearchResults", "getNoSearchResults", "Swift_noSearchResults", "allValid", "getAllValid", "Swift_allValid", "showFooter", "getShowFooter", "Swift_showFooter", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "getTitle", "()Ljava/lang/String;", "Swift_title", "buttonTitle", "getButtonTitle", "Swift_buttonTitle", "searchTitle", "getSearchTitle", "Swift_searchTitle", "allowExpansion", "getAllowExpansion", "Swift_allowExpansion", "setup", "Swift_setup_1", "sendInput", MetricTracker.Object.INPUT, "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "Swift_sendInput_2", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Mode", "Context", "ViewMode", "Field", "Input", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddressViewModel extends AppViewModel {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Context;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "kyc", "billing", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Context implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Context[] $VALUES;
        public static final Context kyc = new Context("kyc", 0);
        public static final Context billing = new Context("billing", 1);

        private static final /* synthetic */ Context[] $values() {
            return new Context[]{kyc, billing};
        }

        static {
            Context[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Context(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Context valueOf(String str) {
            return (Context) Enum.valueOf(Context.class, str);
        }

        public static Context[] values() {
            return (Context[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Mode;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "default", "embedded", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Mode implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;

        /* renamed from: default, reason: not valid java name */
        public static final Mode f14default = new Mode("default", 0);
        public static final Mode embedded = new Mode("embedded", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{f14default, embedded};
        }

        static {
            Mode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Mode(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0082 j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000e"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$ViewMode;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "search", "form", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ViewMode implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ ViewMode[] $VALUES;
        public static final ViewMode search = new ViewMode("search", 0);
        public static final ViewMode form = new ViewMode("form", 1);

        private static final /* synthetic */ ViewMode[] $values() {
            return new ViewMode[]{search, form};
        }

        static {
            ViewMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private ViewMode(String str, int i) {
        }

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static ViewMode valueOf(String str) {
            return (ViewMode) Enum.valueOf(ViewMode.class, str);
        }

        public static ViewMode[] values() {
            return (ViewMode[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }
    }

    public /* synthetic */ AddressViewModel(APIAddress aPIAddress, Context context, Mode mode, ViewMode viewMode, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aPIAddress, context, (i & 4) != 0 ? Mode.embedded : mode, (i & 8) != 0 ? null : viewMode, (i & 16) != 0 ? new b0(12) : function1);
    }

    private final native TextFieldConfig<String> Swift_address1Text(long Swift_peer);

    private final native void Swift_address1Text_set(long Swift_peer, TextFieldConfig<String> value);

    private final native TextFieldConfig<String> Swift_address2Text(long Swift_peer);

    private final native void Swift_address2Text_set(long Swift_peer, TextFieldConfig<String> value);

    private final native boolean Swift_allValid(long Swift_peer);

    private final native boolean Swift_allowExpansion(long Swift_peer);

    private final native String Swift_buttonTitle(long Swift_peer);

    private final native TextFieldConfig<String> Swift_cityText(long Swift_peer);

    private final native void Swift_cityText_set(long Swift_peer, TextFieldConfig<String> value);

    private final native Context Swift_context(long Swift_peer);

    private final native void Swift_context_set(long Swift_peer, Context value);

    private final native ECountry Swift_country(long Swift_peer);

    private final native List<KYCFieldFocus> Swift_formFieldOrder(long Swift_peer);

    private final native void Swift_formFieldOrder_set(long Swift_peer, List<? extends KYCFieldFocus> value);

    private final native boolean Swift_isAnyFieldFocused(long Swift_peer);

    private final native void Swift_isAnyFieldFocused_set(long Swift_peer, boolean value);

    private final native boolean Swift_isLoading(long Swift_peer);

    private final native void Swift_isLoading_set(long Swift_peer, boolean value);

    private final native boolean Swift_isSearchExpanded(long Swift_peer);

    private final native void Swift_isSearchExpanded_set(long Swift_peer, boolean value);

    private final native boolean Swift_isSearching(long Swift_peer);

    private final native void Swift_isSearching_set(long Swift_peer, boolean value);

    private final native Mode Swift_mode(long Swift_peer);

    private final native void Swift_mode_set(long Swift_peer, Mode value);

    private final native boolean Swift_noSearchResults(long Swift_peer);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native TextFieldConfig<String> Swift_searchQueryText(long Swift_peer);

    private final native void Swift_searchQueryText_set(long Swift_peer, TextFieldConfig<String> value);

    private final native List<APIAddress.SearchResult> Swift_searchResults(long Swift_peer);

    private final native void Swift_searchResults_set(long Swift_peer, List<APIAddress.SearchResult> value);

    private final native double Swift_searchScrollOffset(long Swift_peer);

    private final native void Swift_searchScrollOffset_set(long Swift_peer, double value);

    private final native String Swift_searchTitle(long Swift_peer);

    private final native EAmericanState Swift_selectedState(long Swift_peer);

    private final native void Swift_selectedState_set(long Swift_peer, EAmericanState value);

    private final native void Swift_sendInput_2(long Swift_peer, Input input);

    private final native void Swift_setup_1(long Swift_peer);

    private final native boolean Swift_showFooter(long Swift_peer);

    private final native TextFieldConfig<String> Swift_stateText(long Swift_peer);

    private final native void Swift_stateText_set(long Swift_peer, TextFieldConfig<String> value);

    private final native String Swift_title(long Swift_peer);

    private final native ViewMode Swift_viewMode(long Swift_peer);

    private final native void Swift_viewMode_set(long Swift_peer, ViewMode value);

    private final native TextFieldConfig<String> Swift_zipcodeText(long Swift_peer);

    private final native void Swift_zipcodeText_set(long Swift_peer, TextFieldConfig<String> value);

    private static final Unit _init_$lambda$0(APIAddress aPIAddress) {
        aPIAddress.getClass();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit c(APIAddress aPIAddress) {
        return _init_$lambda$0(aPIAddress);
    }

    @Override // com.polymarket.usviewmodels.AppViewModel, skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final TextFieldConfig<String> getAddress1Text() {
        return Swift_address1Text(getSwift_peer());
    }

    public final TextFieldConfig<String> getAddress2Text() {
        return Swift_address2Text(getSwift_peer());
    }

    public final boolean getAllValid() {
        return Swift_allValid(getSwift_peer());
    }

    public final boolean getAllowExpansion() {
        return Swift_allowExpansion(getSwift_peer());
    }

    public final String getButtonTitle() {
        return Swift_buttonTitle(getSwift_peer());
    }

    public final TextFieldConfig<String> getCityText() {
        return Swift_cityText(getSwift_peer());
    }

    public final Context getContext() {
        return Swift_context(getSwift_peer());
    }

    public final ECountry getCountry() {
        return Swift_country(getSwift_peer());
    }

    public final List<KYCFieldFocus> getFormFieldOrder() {
        return Swift_formFieldOrder(getSwift_peer());
    }

    public final Mode getMode() {
        return Swift_mode(getSwift_peer());
    }

    public final boolean getNoSearchResults() {
        return Swift_noSearchResults(getSwift_peer());
    }

    public final TextFieldConfig<String> getSearchQueryText() {
        return Swift_searchQueryText(getSwift_peer());
    }

    public final List<APIAddress.SearchResult> getSearchResults() {
        return Swift_searchResults(getSwift_peer());
    }

    public final double getSearchScrollOffset() {
        return Swift_searchScrollOffset(getSwift_peer());
    }

    public final String getSearchTitle() {
        return Swift_searchTitle(getSwift_peer());
    }

    public final EAmericanState getSelectedState() {
        return Swift_selectedState(getSwift_peer());
    }

    public final boolean getShowFooter() {
        return Swift_showFooter(getSwift_peer());
    }

    public final TextFieldConfig<String> getStateText() {
        return Swift_stateText(getSwift_peer());
    }

    public final String getTitle() {
        return Swift_title(getSwift_peer());
    }

    public final ViewMode getViewMode() {
        return Swift_viewMode(getSwift_peer());
    }

    public final TextFieldConfig<String> getZipcodeText() {
        return Swift_zipcodeText(getSwift_peer());
    }

    public final boolean isAnyFieldFocused() {
        return Swift_isAnyFieldFocused(getSwift_peer());
    }

    public final boolean isLoading() {
        return Swift_isLoading(getSwift_peer());
    }

    public final boolean isSearchExpanded() {
        return Swift_isSearchExpanded(getSwift_peer());
    }

    public final boolean isSearching() {
        return Swift_isSearching(getSwift_peer());
    }

    public final void sendInput(Input input) {
        input.getClass();
        Swift_sendInput_2(getSwift_peer(), input);
    }

    public final void setAddress1Text(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_address1Text_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setAddress2Text(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_address2Text_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setAnyFieldFocused(boolean z) {
        Swift_isAnyFieldFocused_set(getSwift_peer(), z);
    }

    public final void setCityText(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_cityText_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setContext(Context context) {
        context.getClass();
        Swift_context_set(getSwift_peer(), context);
    }

    public final void setFormFieldOrder(List<? extends KYCFieldFocus> list) {
        list.getClass();
        Swift_formFieldOrder_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setLoading(boolean z) {
        Swift_isLoading_set(getSwift_peer(), z);
    }

    public final void setMode(Mode mode) {
        mode.getClass();
        Swift_mode_set(getSwift_peer(), mode);
    }

    public final void setSearchExpanded(boolean z) {
        Swift_isSearchExpanded_set(getSwift_peer(), z);
    }

    public final void setSearchQueryText(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_searchQueryText_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setSearchResults(List<APIAddress.SearchResult> list) {
        list.getClass();
        Swift_searchResults_set(getSwift_peer(), (List) StructKt.sref$default(list, null, 1, null));
    }

    public final void setSearchScrollOffset(double d) {
        Swift_searchScrollOffset_set(getSwift_peer(), d);
    }

    public final void setSearching(boolean z) {
        Swift_isSearching_set(getSwift_peer(), z);
    }

    public final void setSelectedState(EAmericanState eAmericanState) {
        Swift_selectedState_set(getSwift_peer(), eAmericanState);
    }

    public final void setStateText(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_stateText_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    public final void setViewMode(ViewMode viewMode) {
        viewMode.getClass();
        Swift_viewMode_set(getSwift_peer(), viewMode);
    }

    public final void setZipcodeText(TextFieldConfig<String> textFieldConfig) {
        textFieldConfig.getClass();
        Swift_zipcodeText_set(getSwift_peer(), (TextFieldConfig) StructKt.sref$default(textFieldConfig, null, 1, null));
    }

    @Override // com.polymarket.usviewmodels.AppViewModel
    public void setup() {
        Swift_setup_1(getSwift_peer());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0082 J\u0011\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0082 J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0082 R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rj\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u001a"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Field;", "Lskip/lib/CaseIterable;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", "address1", "address2", "city", "zipcode", RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, "", "getTitle", "()Ljava/lang/String;", "Swift_title", Keys.KEY_NAME, "placeholder", "getPlaceholder", "Swift_placeholder", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Field implements CaseIterable, SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Field[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Field address1 = new Field("address1", 0);
        public static final Field address2 = new Field("address2", 1);
        public static final Field city = new Field("city", 2);
        public static final Field zipcode = new Field("zipcode", 3);

        private static final /* synthetic */ Field[] $values() {
            return new Field[]{address1, address2, city, zipcode};
        }

        static {
            Field[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Field(String str, int i) {
        }

        private final native String Swift_placeholder(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        private final native String Swift_title(String name);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final String getPlaceholder() {
            return Swift_placeholder(name());
        }

        public final String getTitle() {
            return Swift_title(name());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Field$Companion;", "Lskip/lib/CaseIterableCompanion;", "Lcom/polymarket/usviewmodels/AddressViewModel$Field;", "<init>", "()V", "allCases", "Lskip/lib/Array;", "getAllCases", "()Lskip/lib/Array;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion implements CaseIterableCompanion<Field> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // skip.lib.CaseIterableCompanion
            public Array<Field> getAllCases() {
                return ArrayKt.arrayOf(Field.address1, Field.address2, Field.city, Field.zipcode);
            }

            private Companion() {
            }
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0082 J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\f\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "analytics", "Lcom/polymarket/clients/ClientAnalyticsInput;", "getAnalytics", "()Lcom/polymarket/clients/ClientAnalyticsInput;", "Swift_analytics", "className", "", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "OnViewDidLoadCase", "OnSelectStateCase", "OnContinueCase", "OnSearchTextChangedCase", "OnSelectSearchResultCase", "OnEnterManuallyCase", "OnSearchFocusChangedCase", "OnCloseSearchTappedCase", "OnAddress1ChangedCase", "OnAddress2ChangedCase", "OnCityChangedCase", "OnZipcodeChangedCase", "Companion", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnAddress1ChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnAddress2ChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnCityChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnCloseSearchTappedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnEnterManuallyCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnSearchFocusChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnSearchTextChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnSelectSearchResultCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnSelectStateCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnZipcodeChangedCase;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Input implements SwiftProjecting {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Input onViewDidLoad = new OnViewDidLoadCase();
        private static final Input onContinue = new OnContinueCase();
        private static final Input onEnterManually = new OnEnterManuallyCase();
        private static final Input onCloseSearchTapped = new OnCloseSearchTappedCase();

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnAddress1ChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAddress1ChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnAddress1ChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnAddress2ChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnAddress2ChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnAddress2ChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnCityChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCityChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnCityChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnCloseSearchTappedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnCloseSearchTappedCase extends Input {
            public OnCloseSearchTappedCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnContinueCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnContinueCase extends Input {
            public OnContinueCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnEnterManuallyCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnEnterManuallyCase extends Input {
            public OnEnterManuallyCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnSearchFocusChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "associated0", "", "<init>", "(Z)V", "getAssociated0", "()Z", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSearchFocusChangedCase extends Input {
            private final boolean associated0;

            public OnSearchFocusChangedCase(boolean z) {
                super(null);
                this.associated0 = z;
            }

            public final boolean getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnSearchTextChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSearchTextChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSearchTextChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnSelectSearchResultCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "associated0", "Lcom/polymarket/data/APIAddress$SearchResult;", "<init>", "(Lcom/polymarket/data/APIAddress$SearchResult;)V", "getAssociated0", "()Lcom/polymarket/data/APIAddress$SearchResult;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectSearchResultCase extends Input {
            private final APIAddress.SearchResult associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSelectSearchResultCase(APIAddress.SearchResult searchResult) {
                super(null);
                searchResult.getClass();
                this.associated0 = searchResult;
            }

            public final APIAddress.SearchResult getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnSelectStateCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "associated0", "Lcom/polymarket/data/EAmericanState;", "<init>", "(Lcom/polymarket/data/EAmericanState;)V", "getAssociated0", "()Lcom/polymarket/data/EAmericanState;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnSelectStateCase extends Input {
            private final EAmericanState associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnSelectStateCase(EAmericanState eAmericanState) {
                super(null);
                eAmericanState.getClass();
                this.associated0 = eAmericanState;
            }

            public final EAmericanState getAssociated0() {
                return this.associated0;
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnViewDidLoadCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "<init>", "()V", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnViewDidLoadCase extends Input {
            public OnViewDidLoadCase() {
                super(null);
            }
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$OnZipcodeChangedCase;", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class OnZipcodeChangedCase extends Input {
            private final String associated0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OnZipcodeChangedCase(String str) {
                super(null);
                str.getClass();
                this.associated0 = str;
            }

            public final String getAssociated0() {
                return this.associated0;
            }
        }

        public /* synthetic */ Input(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native ClientAnalyticsInput Swift_analytics(String className);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static final /* synthetic */ Input access$getOnCloseSearchTapped$cp() {
            return onCloseSearchTapped;
        }

        public static final /* synthetic */ Input access$getOnContinue$cp() {
            return onContinue;
        }

        public static final /* synthetic */ Input access$getOnEnterManually$cp() {
            return onEnterManually;
        }

        public static final /* synthetic */ Input access$getOnViewDidLoad$cp() {
            return onViewDidLoad;
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final ClientAnalyticsInput getAnalytics() {
            return Swift_analytics(getClass().getName());
        }

        /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eJ\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Input$Companion;", "", "<init>", "()V", "onViewDidLoad", "Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "getOnViewDidLoad", "()Lcom/polymarket/usviewmodels/AddressViewModel$Input;", "onSelectState", "associated0", "Lcom/polymarket/data/EAmericanState;", "onContinue", "getOnContinue", "onSearchTextChanged", "", "onSelectSearchResult", "Lcom/polymarket/data/APIAddress$SearchResult;", "onEnterManually", "getOnEnterManually", "onSearchFocusChanged", "", "onCloseSearchTapped", "getOnCloseSearchTapped", "onAddress1Changed", "onAddress2Changed", "onCityChanged", "onZipcodeChanged", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Input getOnCloseSearchTapped() {
                return Input.access$getOnCloseSearchTapped$cp();
            }

            public final Input getOnContinue() {
                return Input.access$getOnContinue$cp();
            }

            public final Input getOnEnterManually() {
                return Input.access$getOnEnterManually$cp();
            }

            public final Input getOnViewDidLoad() {
                return Input.access$getOnViewDidLoad$cp();
            }

            public final Input onAddress1Changed(String associated0) {
                associated0.getClass();
                return new OnAddress1ChangedCase(associated0);
            }

            public final Input onAddress2Changed(String associated0) {
                associated0.getClass();
                return new OnAddress2ChangedCase(associated0);
            }

            public final Input onCityChanged(String associated0) {
                associated0.getClass();
                return new OnCityChangedCase(associated0);
            }

            public final Input onSearchFocusChanged(boolean associated0) {
                return new OnSearchFocusChangedCase(associated0);
            }

            public final Input onSearchTextChanged(String associated0) {
                associated0.getClass();
                return new OnSearchTextChangedCase(associated0);
            }

            public final Input onSelectSearchResult(APIAddress.SearchResult associated0) {
                associated0.getClass();
                return new OnSelectSearchResultCase(associated0);
            }

            public final Input onSelectState(EAmericanState associated0) {
                associated0.getClass();
                return new OnSelectStateCase(associated0);
            }

            public final Input onZipcodeChanged(String associated0) {
                associated0.getClass();
                return new OnZipcodeChangedCase(associated0);
            }

            private Companion() {
            }
        }

        private Input() {
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JE\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082 ¨\u0006\u0012"}, d2 = {"Lcom/polymarket/usviewmodels/AddressViewModel$Companion;", "Lcom/polymarket/usviewmodels/AppViewModel$CompanionClass;", "<init>", "()V", "Swift_Companion_constructor_0", "", "Lskip/bridge/SwiftObjectPointer;", PlaceTypes.ADDRESS, "Lcom/polymarket/data/APIAddress;", "context", "Lcom/polymarket/usviewmodels/AddressViewModel$Context;", RadarTripOptions.KEY_MODE, "Lcom/polymarket/usviewmodels/AddressViewModel$Mode;", "initialViewMode", "Lcom/polymarket/usviewmodels/AddressViewModel$ViewMode;", "onAddressEntered", "Lkotlin/Function1;", "", "USViewModels"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion extends AppViewModel.CompanionClass {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final native long Swift_Companion_constructor_0(APIAddress address, Context context, Mode mode, ViewMode initialViewMode, Function1<? super APIAddress, Unit> onAddressEntered);

        public static final /* synthetic */ long access$Swift_Companion_constructor_0(Companion companion, APIAddress aPIAddress, Context context, Mode mode, ViewMode viewMode, Function1 function1) {
            return companion.Swift_Companion_constructor_0(aPIAddress, context, mode, viewMode, function1);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressViewModel(APIAddress aPIAddress, Context context, Mode mode, ViewMode viewMode, Function1<? super APIAddress, Unit> function1) {
        super(Companion.access$Swift_Companion_constructor_0(INSTANCE, aPIAddress, context, mode, viewMode, function1), (SwiftPeerMarker) null);
        context.getClass();
        mode.getClass();
        function1.getClass();
    }

    public AddressViewModel(long j, SwiftPeerMarker swiftPeerMarker) {
        super(j, swiftPeerMarker);
    }
}
