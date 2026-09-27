package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.brn;
import defpackage.jnf;
import defpackage.jr9;
import defpackage.zk5;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class Place implements Parcelable {
    public static final int PRICE_LEVEL_MAX_VALUE = 4;
    public static final int PRICE_LEVEL_MIN_VALUE = 0;
    public static final double RATING_MAX_VALUE = 5.0d;
    public static final double RATING_MIN_VALUE = 1.0d;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum BooleanPlaceAttributeValue implements Parcelable {
        UNKNOWN,
        TRUE,
        FALSE;

        public static final Parcelable.Creator<BooleanPlaceAttributeValue> CREATOR = new zzib();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class Builder {
        public Place build() {
            Place zza = zza();
            List<String> attributions = zza.getAttributions();
            if (attributions != null) {
                Iterator<String> it = attributions.iterator();
                while (it.hasNext()) {
                    brn.g("Attributions must not contain null or empty values.", !TextUtils.isEmpty(it.next()));
                }
            }
            Integer priceLevel = zza.getPriceLevel();
            if (priceLevel != null) {
                brn.i(jnf.a(0, 4).b(priceLevel), "Price Level must not be out-of-range: %s to %s, but was: %s.", 0, 4, priceLevel);
            }
            Double rating = zza.getRating();
            if (rating != null) {
                Double valueOf = Double.valueOf(1.0d);
                Double valueOf2 = Double.valueOf(5.0d);
                brn.i(jnf.a(valueOf, valueOf2).b(rating), "Rating must not be out-of-range: %s to %s, but was: %s.", valueOf, valueOf2, rating);
            }
            Integer userRatingCount = zza.getUserRatingCount();
            if (userRatingCount != null) {
                jnf jnfVar = jnf.c;
                brn.e(userRatingCount, "User Ratings Total must not be < 0, but was: %s.", new jnf(new zk5(0, 2), zk5.c).b(userRatingCount));
            }
            if (attributions != null) {
                setAttributions(jr9.m(attributions));
            }
            List<PhotoMetadata> photoMetadatas = zza.getPhotoMetadatas();
            if (photoMetadatas != null) {
                setPhotoMetadatas(jr9.m(photoMetadatas));
            }
            List<String> placeTypes = zza.getPlaceTypes();
            if (placeTypes != null) {
                setPlaceTypes(jr9.m(placeTypes));
            }
            List<OpeningHours> secondaryOpeningHours = zza.getSecondaryOpeningHours();
            if (secondaryOpeningHours != null) {
                setSecondaryOpeningHours(jr9.m(secondaryOpeningHours));
            }
            List<Review> reviews = zza.getReviews();
            if (reviews != null) {
                setReviews(jr9.m(reviews));
            }
            List<ContainingPlace> containingPlaces = zza.getContainingPlaces();
            if (containingPlaces != null) {
                setContainingPlaces(jr9.m(containingPlaces));
            }
            return zza();
        }

        public abstract AccessibilityOptions getAccessibilityOptions();

        public abstract AddressComponents getAddressComponents();

        public abstract AddressDescriptor getAddressDescriptor();

        public abstract String getAdrFormatAddress();

        public abstract BooleanPlaceAttributeValue getAllowsDogs();

        public abstract List<String> getAttributions();

        public abstract BusinessStatus getBusinessStatus();

        public abstract ConsumerAlert getConsumerAlert();

        public abstract List<ContainingPlace> getContainingPlaces();

        public abstract BooleanPlaceAttributeValue getCurbsidePickup();

        public abstract OpeningHours getCurrentOpeningHours();

        public abstract List<OpeningHours> getCurrentSecondaryOpeningHours();

        public abstract BooleanPlaceAttributeValue getDelivery();

        public abstract BooleanPlaceAttributeValue getDineIn();

        public abstract String getDisplayName();

        public abstract String getDisplayNameLanguageCode();

        public abstract String getEditorialSummary();

        public abstract String getEditorialSummaryLanguageCode();

        public abstract EvChargeAmenitySummary getEvChargeAmenitySummary();

        public abstract EVChargeOptions getEvChargeOptions();

        public abstract String getFormattedAddress();

        public abstract FuelOptions getFuelOptions();

        public abstract GenerativeSummary getGenerativeSummary();

        public abstract BooleanPlaceAttributeValue getGoodForChildren();

        public abstract BooleanPlaceAttributeValue getGoodForGroups();

        public abstract BooleanPlaceAttributeValue getGoodForWatchingSports();

        public abstract GoogleMapsLinks getGoogleMapsLinks();

        public abstract Uri getGoogleMapsUri();

        public abstract Integer getIconBackgroundColor();

        public abstract String getIconMaskUrl();

        public abstract String getId();

        public abstract String getInternationalPhoneNumber();

        public abstract BooleanPlaceAttributeValue getLiveMusic();

        public abstract LatLng getLocation();

        public abstract BooleanPlaceAttributeValue getMenuForChildren();

        public abstract String getNationalPhoneNumber();

        public abstract NeighborhoodSummary getNeighborhoodSummary();

        public abstract OpeningHours getOpeningHours();

        public abstract BooleanPlaceAttributeValue getOutdoorSeating();

        public abstract ParkingOptions getParkingOptions();

        public abstract PaymentOptions getPaymentOptions();

        public abstract List<PhotoMetadata> getPhotoMetadatas();

        public abstract List<String> getPlaceTypes();

        public abstract PlusCode getPlusCode();

        public abstract PostalAddress getPostalAddress();

        public abstract Integer getPriceLevel();

        public abstract PriceRange getPriceRange();

        public abstract String getPrimaryType();

        public abstract String getPrimaryTypeDisplayName();

        public abstract String getPrimaryTypeDisplayNameLanguageCode();

        public abstract BooleanPlaceAttributeValue getPureServiceAreaBusiness();

        public abstract Double getRating();

        public abstract BooleanPlaceAttributeValue getReservable();

        public abstract String getResourceName();

        public abstract BooleanPlaceAttributeValue getRestroom();

        public abstract ReviewSummary getReviewSummary();

        public abstract List<Review> getReviews();

        public abstract List<OpeningHours> getSecondaryOpeningHours();

        public abstract BooleanPlaceAttributeValue getServesBeer();

        public abstract BooleanPlaceAttributeValue getServesBreakfast();

        public abstract BooleanPlaceAttributeValue getServesBrunch();

        public abstract BooleanPlaceAttributeValue getServesCocktails();

        public abstract BooleanPlaceAttributeValue getServesCoffee();

        public abstract BooleanPlaceAttributeValue getServesDessert();

        public abstract BooleanPlaceAttributeValue getServesDinner();

        public abstract BooleanPlaceAttributeValue getServesLunch();

        public abstract BooleanPlaceAttributeValue getServesVegetarianFood();

        public abstract BooleanPlaceAttributeValue getServesWine();

        public abstract String getShortFormattedAddress();

        public abstract List<SubDestination> getSubDestinations();

        public abstract BooleanPlaceAttributeValue getTakeout();

        public abstract ZoneId getTimeZone();

        public abstract Integer getUserRatingCount();

        public abstract Integer getUtcOffsetMinutes();

        public abstract LatLngBounds getViewport();

        public abstract Uri getWebsiteUri();

        public abstract Builder setAccessibilityOptions(AccessibilityOptions accessibilityOptions);

        public abstract Builder setAddressComponents(AddressComponents addressComponents);

        public abstract Builder setAddressDescriptor(AddressDescriptor addressDescriptor);

        public abstract Builder setAdrFormatAddress(String str);

        public abstract Builder setAllowsDogs(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setAttributions(List<String> list);

        public abstract Builder setBusinessStatus(BusinessStatus businessStatus);

        public abstract Builder setConsumerAlert(ConsumerAlert consumerAlert);

        public abstract Builder setContainingPlaces(List<ContainingPlace> list);

        public abstract Builder setCurbsidePickup(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setCurrentOpeningHours(OpeningHours openingHours);

        public abstract Builder setCurrentSecondaryOpeningHours(List<OpeningHours> list);

        public abstract Builder setDelivery(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setDineIn(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setDisplayName(String str);

        public abstract Builder setDisplayNameLanguageCode(String str);

        public abstract Builder setEditorialSummary(String str);

        public abstract Builder setEditorialSummaryLanguageCode(String str);

        public abstract Builder setEvChargeAmenitySummary(EvChargeAmenitySummary evChargeAmenitySummary);

        public abstract Builder setEvChargeOptions(EVChargeOptions eVChargeOptions);

        public abstract Builder setFormattedAddress(String str);

        public abstract Builder setFuelOptions(FuelOptions fuelOptions);

        public abstract Builder setGenerativeSummary(GenerativeSummary generativeSummary);

        public abstract Builder setGoodForChildren(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setGoodForGroups(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setGoodForWatchingSports(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setGoogleMapsLinks(GoogleMapsLinks googleMapsLinks);

        public abstract Builder setGoogleMapsUri(Uri uri);

        public abstract Builder setIconBackgroundColor(Integer num);

        public abstract Builder setIconMaskUrl(String str);

        public abstract Builder setId(String str);

        public abstract Builder setInternationalPhoneNumber(String str);

        public abstract Builder setLiveMusic(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setLocation(LatLng latLng);

        public abstract Builder setMenuForChildren(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setNationalPhoneNumber(String str);

        public abstract Builder setNeighborhoodSummary(NeighborhoodSummary neighborhoodSummary);

        public abstract Builder setOpeningHours(OpeningHours openingHours);

        public abstract Builder setOutdoorSeating(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setParkingOptions(ParkingOptions parkingOptions);

        public abstract Builder setPaymentOptions(PaymentOptions paymentOptions);

        public abstract Builder setPhotoMetadatas(List<PhotoMetadata> list);

        public abstract Builder setPlaceTypes(List<String> list);

        public abstract Builder setPlusCode(PlusCode plusCode);

        public abstract Builder setPostalAddress(PostalAddress postalAddress);

        public abstract Builder setPriceLevel(Integer num);

        public abstract Builder setPriceRange(PriceRange priceRange);

        public abstract Builder setPrimaryType(String str);

        public abstract Builder setPrimaryTypeDisplayName(String str);

        public abstract Builder setPrimaryTypeDisplayNameLanguageCode(String str);

        public abstract Builder setPureServiceAreaBusiness(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setRating(Double d);

        public abstract Builder setReservable(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setResourceName(String str);

        public abstract Builder setRestroom(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setReviewSummary(ReviewSummary reviewSummary);

        public abstract Builder setReviews(List<Review> list);

        public abstract Builder setSecondaryOpeningHours(List<OpeningHours> list);

        public abstract Builder setServesBeer(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesBreakfast(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesBrunch(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesCocktails(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesCoffee(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesDessert(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesDinner(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesLunch(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesVegetarianFood(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setServesWine(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setShortFormattedAddress(String str);

        public abstract Builder setSubDestinations(List<SubDestination> list);

        public abstract Builder setTakeout(BooleanPlaceAttributeValue booleanPlaceAttributeValue);

        public abstract Builder setTimeZone(ZoneId zoneId);

        public abstract Builder setUserRatingCount(Integer num);

        public abstract Builder setUtcOffsetMinutes(Integer num);

        public abstract Builder setViewport(LatLngBounds latLngBounds);

        public abstract Builder setWebsiteUri(Uri uri);

        public abstract Place zza();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum BusinessStatus implements Parcelable {
        OPERATIONAL,
        CLOSED_TEMPORARILY,
        CLOSED_PERMANENTLY;

        public static final Parcelable.Creator<BusinessStatus> CREATOR = new zzic();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public enum Field implements Parcelable {
        ACCESSIBILITY_OPTIONS,
        ADDRESS_COMPONENTS,
        ADDRESS_DESCRIPTOR,
        ADR_FORMAT_ADDRESS,
        ALLOWS_DOGS,
        BUSINESS_STATUS,
        CONSUMER_ALERT,
        CONTAINING_PLACES,
        CURBSIDE_PICKUP,
        CURRENT_OPENING_HOURS,
        CURRENT_SECONDARY_OPENING_HOURS,
        DELIVERY,
        DINE_IN,
        DISPLAY_NAME,
        EDITORIAL_SUMMARY,
        EV_CHARGE_AMENITY_SUMMARY,
        EV_CHARGE_OPTIONS,
        FORMATTED_ADDRESS,
        FUEL_OPTIONS,
        GENERATIVE_SUMMARY,
        GOOD_FOR_CHILDREN,
        GOOD_FOR_GROUPS,
        GOOD_FOR_WATCHING_SPORTS,
        GOOGLE_MAPS_LINKS,
        GOOGLE_MAPS_URI,
        ICON_BACKGROUND_COLOR,
        ICON_MASK_URL,
        ID,
        INTERNATIONAL_PHONE_NUMBER,
        LIVE_MUSIC,
        LOCATION,
        MENU_FOR_CHILDREN,
        NATIONAL_PHONE_NUMBER,
        NEIGHBORHOOD_SUMMARY,
        OPENING_HOURS,
        OUTDOOR_SEATING,
        PARKING_OPTIONS,
        PAYMENT_OPTIONS,
        PHOTO_METADATAS,
        PLUS_CODE,
        POSTAL_ADDRESS,
        PRICE_LEVEL,
        PRICE_RANGE,
        PRIMARY_TYPE,
        PRIMARY_TYPE_DISPLAY_NAME,
        PURE_SERVICE_AREA_BUSINESS,
        RATING,
        RESERVABLE,
        RESOURCE_NAME,
        RESTROOM,
        REVIEWS,
        REVIEW_SUMMARY,
        SECONDARY_OPENING_HOURS,
        SERVES_BEER,
        SERVES_BREAKFAST,
        SERVES_BRUNCH,
        SERVES_COCKTAILS,
        SERVES_COFFEE,
        SERVES_DESSERT,
        SERVES_DINNER,
        SERVES_LUNCH,
        SERVES_VEGETARIAN_FOOD,
        SERVES_WINE,
        SHORT_FORMATTED_ADDRESS,
        SUB_DESTINATIONS,
        TAKEOUT,
        TIME_ZONE,
        TYPES,
        USER_RATING_COUNT,
        UTC_OFFSET,
        VIEWPORT,
        WEBSITE_URI;

        public static final Parcelable.Creator<Field> CREATOR = new zzid();

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static Builder builder() {
        zzbu zzbuVar = new zzbu();
        BooleanPlaceAttributeValue booleanPlaceAttributeValue = BooleanPlaceAttributeValue.UNKNOWN;
        zzbuVar.setCurbsidePickup(booleanPlaceAttributeValue);
        zzbuVar.setDelivery(booleanPlaceAttributeValue);
        zzbuVar.setDineIn(booleanPlaceAttributeValue);
        zzbuVar.setReservable(booleanPlaceAttributeValue);
        zzbuVar.setServesBeer(booleanPlaceAttributeValue);
        zzbuVar.setServesBreakfast(booleanPlaceAttributeValue);
        zzbuVar.setServesBrunch(booleanPlaceAttributeValue);
        zzbuVar.setServesDinner(booleanPlaceAttributeValue);
        zzbuVar.setServesLunch(booleanPlaceAttributeValue);
        zzbuVar.setServesVegetarianFood(booleanPlaceAttributeValue);
        zzbuVar.setServesWine(booleanPlaceAttributeValue);
        zzbuVar.setTakeout(booleanPlaceAttributeValue);
        zzbuVar.setOutdoorSeating(booleanPlaceAttributeValue);
        zzbuVar.setLiveMusic(booleanPlaceAttributeValue);
        zzbuVar.setMenuForChildren(booleanPlaceAttributeValue);
        zzbuVar.setServesCocktails(booleanPlaceAttributeValue);
        zzbuVar.setServesDessert(booleanPlaceAttributeValue);
        zzbuVar.setServesCoffee(booleanPlaceAttributeValue);
        zzbuVar.setGoodForChildren(booleanPlaceAttributeValue);
        zzbuVar.setAllowsDogs(booleanPlaceAttributeValue);
        zzbuVar.setRestroom(booleanPlaceAttributeValue);
        zzbuVar.setGoodForGroups(booleanPlaceAttributeValue);
        zzbuVar.setGoodForWatchingSports(booleanPlaceAttributeValue);
        zzbuVar.setPureServiceAreaBusiness(booleanPlaceAttributeValue);
        return zzbuVar;
    }

    public abstract AccessibilityOptions getAccessibilityOptions();

    public abstract AddressComponents getAddressComponents();

    public abstract AddressDescriptor getAddressDescriptor();

    public abstract String getAdrFormatAddress();

    public abstract BooleanPlaceAttributeValue getAllowsDogs();

    public abstract List<String> getAttributions();

    public abstract BusinessStatus getBusinessStatus();

    public abstract ConsumerAlert getConsumerAlert();

    public abstract List<ContainingPlace> getContainingPlaces();

    public abstract BooleanPlaceAttributeValue getCurbsidePickup();

    public abstract OpeningHours getCurrentOpeningHours();

    public abstract List<OpeningHours> getCurrentSecondaryOpeningHours();

    public abstract BooleanPlaceAttributeValue getDelivery();

    public abstract BooleanPlaceAttributeValue getDineIn();

    public abstract String getDisplayName();

    public abstract String getDisplayNameLanguageCode();

    public abstract String getEditorialSummary();

    public abstract String getEditorialSummaryLanguageCode();

    public abstract EvChargeAmenitySummary getEvChargeAmenitySummary();

    public abstract EVChargeOptions getEvChargeOptions();

    public abstract String getFormattedAddress();

    public abstract FuelOptions getFuelOptions();

    public abstract GenerativeSummary getGenerativeSummary();

    public abstract BooleanPlaceAttributeValue getGoodForChildren();

    public abstract BooleanPlaceAttributeValue getGoodForGroups();

    public abstract BooleanPlaceAttributeValue getGoodForWatchingSports();

    public abstract GoogleMapsLinks getGoogleMapsLinks();

    public abstract Uri getGoogleMapsUri();

    public abstract Integer getIconBackgroundColor();

    public abstract String getIconMaskUrl();

    public abstract String getId();

    public abstract String getInternationalPhoneNumber();

    public abstract BooleanPlaceAttributeValue getLiveMusic();

    public abstract LatLng getLocation();

    public abstract BooleanPlaceAttributeValue getMenuForChildren();

    public abstract String getNationalPhoneNumber();

    public abstract NeighborhoodSummary getNeighborhoodSummary();

    public abstract OpeningHours getOpeningHours();

    public abstract BooleanPlaceAttributeValue getOutdoorSeating();

    public abstract ParkingOptions getParkingOptions();

    public abstract PaymentOptions getPaymentOptions();

    public abstract List<PhotoMetadata> getPhotoMetadatas();

    public abstract List<String> getPlaceTypes();

    public abstract PlusCode getPlusCode();

    public abstract PostalAddress getPostalAddress();

    public abstract Integer getPriceLevel();

    public abstract PriceRange getPriceRange();

    public abstract String getPrimaryType();

    public abstract String getPrimaryTypeDisplayName();

    public abstract String getPrimaryTypeDisplayNameLanguageCode();

    public abstract BooleanPlaceAttributeValue getPureServiceAreaBusiness();

    public abstract Double getRating();

    public abstract BooleanPlaceAttributeValue getReservable();

    public abstract String getResourceName();

    public abstract BooleanPlaceAttributeValue getRestroom();

    public abstract ReviewSummary getReviewSummary();

    public abstract List<Review> getReviews();

    public abstract List<OpeningHours> getSecondaryOpeningHours();

    public abstract BooleanPlaceAttributeValue getServesBeer();

    public abstract BooleanPlaceAttributeValue getServesBreakfast();

    public abstract BooleanPlaceAttributeValue getServesBrunch();

    public abstract BooleanPlaceAttributeValue getServesCocktails();

    public abstract BooleanPlaceAttributeValue getServesCoffee();

    public abstract BooleanPlaceAttributeValue getServesDessert();

    public abstract BooleanPlaceAttributeValue getServesDinner();

    public abstract BooleanPlaceAttributeValue getServesLunch();

    public abstract BooleanPlaceAttributeValue getServesVegetarianFood();

    public abstract BooleanPlaceAttributeValue getServesWine();

    public abstract String getShortFormattedAddress();

    public abstract List<SubDestination> getSubDestinations();

    public abstract BooleanPlaceAttributeValue getTakeout();

    public abstract ZoneId getTimeZone();

    public abstract Integer getUserRatingCount();

    public abstract Integer getUtcOffsetMinutes();

    public abstract LatLngBounds getViewport();

    public abstract Uri getWebsiteUri();

    public abstract Builder zza();
}
