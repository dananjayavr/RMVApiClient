
package de.rmv.hapirest.model;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.rmvapiclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StopLocation_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "StopLocation");
    private final static QName _CoordLocation_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "CoordLocation");
    private final static QName _LocationNote_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "LocationNote");
    private final static QName _Arrival_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "Arrival");
    private final static QName _Message_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "Message");
    private final static QName _Departure_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "Departure");
    private final static QName _JourneyDetail_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "JourneyDetail");
    private final static QName _JourneyStatus_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "JourneyStatus");
    private final static QName _ServiceDays_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "ServiceDays");
    private final static QName _TripList_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "TripList");
    private final static QName _Trip_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "Trip");
    private final static QName _Leg_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "Leg");
    private final static QName _Origin_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "Origin");
    private final static QName _Destination_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "Destination");
    private final static QName _LocationPreselectionResponse_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "LocationPreselectionResponse");
    private final static QName _ReconstructionConvertResponse_QNAME = new QName("http://hacon.de/hafas/proxy/hafas-proxy", "ReconstructionConvertResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.rmvapiclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TechnicalMessage }
     * 
     */
    public TechnicalMessage createTechnicalMessage() {
        return new TechnicalMessage();
    }

    /**
     * Create an instance of {@link TechnicalMessages }
     * 
     */
    public TechnicalMessages createTechnicalMessages() {
        return new TechnicalMessages();
    }

    /**
     * Create an instance of {@link Warning }
     * 
     */
    public Warning createWarning() {
        return new Warning();
    }

    /**
     * Create an instance of {@link Warnings }
     * 
     */
    public Warnings createWarnings() {
        return new Warnings();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link CommonResponseType }
     * 
     */
    public CommonResponseType createCommonResponseType() {
        return new CommonResponseType();
    }

    /**
     * Create an instance of {@link LocationDetails }
     * 
     */
    public LocationDetails createLocationDetails() {
        return new LocationDetails();
    }

    /**
     * Create an instance of {@link StopLocation }
     * 
     */
    public StopLocation createStopLocation() {
        return new StopLocation();
    }

    /**
     * Create an instance of {@link CoordLocation }
     * 
     */
    public CoordLocation createCoordLocation() {
        return new CoordLocation();
    }

    /**
     * Create an instance of {@link LocationList }
     * 
     */
    public LocationList createLocationList() {
        return new LocationList();
    }

    /**
     * Create an instance of {@link LocationNotes }
     * 
     */
    public LocationNotes createLocationNotes() {
        return new LocationNotes();
    }

    /**
     * Create an instance of {@link LocationNote }
     * 
     */
    public LocationNote createLocationNote() {
        return new LocationNote();
    }

    /**
     * Create an instance of {@link MultiBoard }
     * 
     */
    public MultiBoard createMultiBoard() {
        return new MultiBoard();
    }

    /**
     * Create an instance of {@link ArrivalBoard }
     * 
     */
    public ArrivalBoard createArrivalBoard() {
        return new ArrivalBoard();
    }

    /**
     * Create an instance of {@link Arrival }
     * 
     */
    public Arrival createArrival() {
        return new Arrival();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link DepartureBoard }
     * 
     */
    public DepartureBoard createDepartureBoard() {
        return new DepartureBoard();
    }

    /**
     * Create an instance of {@link Departure }
     * 
     */
    public Departure createDeparture() {
        return new Departure();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link JourneyDetailRef }
     * 
     */
    public JourneyDetailRef createJourneyDetailRef() {
        return new JourneyDetailRef();
    }

    /**
     * Create an instance of {@link JourneyDetailGroupList }
     * 
     */
    public JourneyDetailGroupList createJourneyDetailGroupList() {
        return new JourneyDetailGroupList();
    }

    /**
     * Create an instance of {@link JourneyDetailGroup }
     * 
     */
    public JourneyDetailGroup createJourneyDetailGroup() {
        return new JourneyDetailGroup();
    }

    /**
     * Create an instance of {@link JourneyDetail }
     * 
     */
    public JourneyDetail createJourneyDetail() {
        return new JourneyDetail();
    }

    /**
     * Create an instance of {@link JourneyDetailList }
     * 
     */
    public JourneyDetailList createJourneyDetailList() {
        return new JourneyDetailList();
    }

    /**
     * Create an instance of {@link Stops }
     * 
     */
    public Stops createStops() {
        return new Stops();
    }

    /**
     * Create an instance of {@link StopType }
     * 
     */
    public StopType createStopType() {
        return new StopType();
    }

    /**
     * Create an instance of {@link Directions }
     * 
     */
    public Directions createDirections() {
        return new Directions();
    }

    /**
     * Create an instance of {@link Direction }
     * 
     */
    public Direction createDirection() {
        return new Direction();
    }

    /**
     * Create an instance of {@link Messages }
     * 
     */
    public Messages createMessages() {
        return new Messages();
    }

    /**
     * Create an instance of {@link Names }
     * 
     */
    public Names createNames() {
        return new Names();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link ServiceDays }
     * 
     */
    public ServiceDays createServiceDays() {
        return new ServiceDays();
    }

    /**
     * Create an instance of {@link TripList }
     * 
     */
    public TripList createTripList() {
        return new TripList();
    }

    /**
     * Create an instance of {@link TripType }
     * 
     */
    public TripType createTripType() {
        return new TripType();
    }

    /**
     * Create an instance of {@link LegList }
     * 
     */
    public LegList createLegList() {
        return new LegList();
    }

    /**
     * Create an instance of {@link Leg }
     * 
     */
    public Leg createLeg() {
        return new Leg();
    }

    /**
     * Create an instance of {@link OriginDestType }
     * 
     */
    public OriginDestType createOriginDestType() {
        return new OriginDestType();
    }

    /**
     * Create an instance of {@link GisRef }
     * 
     */
    public GisRef createGisRef() {
        return new GisRef();
    }

    /**
     * Create an instance of {@link TariffResult }
     * 
     */
    public TariffResult createTariffResult() {
        return new TariffResult();
    }

    /**
     * Create an instance of {@link FareSetItem }
     * 
     */
    public FareSetItem createFareSetItem() {
        return new FareSetItem();
    }

    /**
     * Create an instance of {@link KVType }
     * 
     */
    public KVType createKVType() {
        return new KVType();
    }

    /**
     * Create an instance of {@link FareItem }
     * 
     */
    public FareItem createFareItem() {
        return new FareItem();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link ExternalContentType }
     * 
     */
    public ExternalContentType createExternalContentType() {
        return new ExternalContentType();
    }

    /**
     * Create an instance of {@link HimMessages }
     * 
     */
    public HimMessages createHimMessages() {
        return new HimMessages();
    }

    /**
     * Create an instance of {@link JourneyList }
     * 
     */
    public JourneyList createJourneyList() {
        return new JourneyList();
    }

    /**
     * Create an instance of {@link JourneyType }
     * 
     */
    public JourneyType createJourneyType() {
        return new JourneyType();
    }

    /**
     * Create an instance of {@link JourneyValidation }
     * 
     */
    public JourneyValidation createJourneyValidation() {
        return new JourneyValidation();
    }

    /**
     * Create an instance of {@link BooleanKVType }
     * 
     */
    public BooleanKVType createBooleanKVType() {
        return new BooleanKVType();
    }

    /**
     * Create an instance of {@link TimetableInfoList }
     * 
     */
    public TimetableInfoList createTimetableInfoList() {
        return new TimetableInfoList();
    }

    /**
     * Create an instance of {@link TimetableInfoType }
     * 
     */
    public TimetableInfoType createTimetableInfoType() {
        return new TimetableInfoType();
    }

    /**
     * Create an instance of {@link TrackData }
     * 
     */
    public TrackData createTrackData() {
        return new TrackData();
    }

    /**
     * Create an instance of {@link TrackPoint }
     * 
     */
    public TrackPoint createTrackPoint() {
        return new TrackPoint();
    }

    /**
     * Create an instance of {@link TrackSectionData }
     * 
     */
    public TrackSectionData createTrackSectionData() {
        return new TrackSectionData();
    }

    /**
     * Create an instance of {@link JourneyTrackMatch }
     * 
     */
    public JourneyTrackMatch createJourneyTrackMatch() {
        return new JourneyTrackMatch();
    }

    /**
     * Create an instance of {@link JourneyTrackMatchResult }
     * 
     */
    public JourneyTrackMatchResult createJourneyTrackMatchResult() {
        return new JourneyTrackMatchResult();
    }

    /**
     * Create an instance of {@link TrackMatchJourneyDetail }
     * 
     */
    public TrackMatchJourneyDetail createTrackMatchJourneyDetail() {
        return new TrackMatchJourneyDetail();
    }

    /**
     * Create an instance of {@link LineList }
     * 
     */
    public LineList createLineList() {
        return new LineList();
    }

    /**
     * Create an instance of {@link LineType }
     * 
     */
    public LineType createLineType() {
        return new LineType();
    }

    /**
     * Create an instance of {@link DataInfo }
     * 
     */
    public DataInfo createDataInfo() {
        return new DataInfo();
    }

    /**
     * Create an instance of {@link OperatorType }
     * 
     */
    public OperatorType createOperatorType() {
        return new OperatorType();
    }

    /**
     * Create an instance of {@link ProductCategoryType }
     * 
     */
    public ProductCategoryType createProductCategoryType() {
        return new ProductCategoryType();
    }

    /**
     * Create an instance of {@link RegionType }
     * 
     */
    public RegionType createRegionType() {
        return new RegionType();
    }

    /**
     * Create an instance of {@link MapInfoType }
     * 
     */
    public MapInfoType createMapInfoType() {
        return new MapInfoType();
    }

    /**
     * Create an instance of {@link WalkingLinks }
     * 
     */
    public WalkingLinks createWalkingLinks() {
        return new WalkingLinks();
    }

    /**
     * Create an instance of {@link WalkingLinkType }
     * 
     */
    public WalkingLinkType createWalkingLinkType() {
        return new WalkingLinkType();
    }

    /**
     * Create an instance of {@link ReconstructionMatchRequest }
     * 
     */
    public ReconstructionMatchRequest createReconstructionMatchRequest() {
        return new ReconstructionMatchRequest();
    }

    /**
     * Create an instance of {@link ReconstructionSectionDataType }
     * 
     */
    public ReconstructionSectionDataType createReconstructionSectionDataType() {
        return new ReconstructionSectionDataType();
    }

    /**
     * Create an instance of {@link TravellerProfileType }
     * 
     */
    public TravellerProfileType createTravellerProfileType() {
        return new TravellerProfileType();
    }

    /**
     * Create an instance of {@link ManyToManyConnectionRequest }
     * 
     */
    public ManyToManyConnectionRequest createManyToManyConnectionRequest() {
        return new ManyToManyConnectionRequest();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link ViaType }
     * 
     */
    public ViaType createViaType() {
        return new ViaType();
    }

    /**
     * Create an instance of {@link AvoidType }
     * 
     */
    public AvoidType createAvoidType() {
        return new AvoidType();
    }

    /**
     * Create an instance of {@link RoutingPreselectionType }
     * 
     */
    public RoutingPreselectionType createRoutingPreselectionType() {
        return new RoutingPreselectionType();
    }

    /**
     * Create an instance of {@link GisProfile }
     * 
     */
    public GisProfile createGisProfile() {
        return new GisProfile();
    }

    /**
     * Create an instance of {@link TripSearchFilterType }
     * 
     */
    public TripSearchFilterType createTripSearchFilterType() {
        return new TripSearchFilterType();
    }

    /**
     * Create an instance of {@link SearchOptionsType }
     * 
     */
    public SearchOptionsType createSearchOptionsType() {
        return new SearchOptionsType();
    }

    /**
     * Create an instance of {@link OutputControlType }
     * 
     */
    public OutputControlType createOutputControlType() {
        return new OutputControlType();
    }

    /**
     * Create an instance of {@link LocationPreselectionRequest }
     * 
     */
    public LocationPreselectionRequest createLocationPreselectionRequest() {
        return new LocationPreselectionRequest();
    }

    /**
     * Create an instance of {@link LocationPreselectionResponse }
     * 
     */
    public LocationPreselectionResponse createLocationPreselectionResponse() {
        return new LocationPreselectionResponse();
    }

    /**
     * Create an instance of {@link PartialTripSearchRequest }
     * 
     */
    public PartialTripSearchRequest createPartialTripSearchRequest() {
        return new PartialTripSearchRequest();
    }

    /**
     * Create an instance of {@link PartialTripSearchSettingsType }
     * 
     */
    public PartialTripSearchSettingsType createPartialTripSearchSettingsType() {
        return new PartialTripSearchSettingsType();
    }

    /**
     * Create an instance of {@link ReconstructionConvertRequest }
     * 
     */
    public ReconstructionConvertRequest createReconstructionConvertRequest() {
        return new ReconstructionConvertRequest();
    }

    /**
     * Create an instance of {@link ReconstructionConvertResponse }
     * 
     */
    public ReconstructionConvertResponse createReconstructionConvertResponse() {
        return new ReconstructionConvertResponse();
    }

    /**
     * Create an instance of {@link GeoFeatureList }
     * 
     */
    public GeoFeatureList createGeoFeatureList() {
        return new GeoFeatureList();
    }

    /**
     * Create an instance of {@link GeoFeatureType }
     * 
     */
    public GeoFeatureType createGeoFeatureType() {
        return new GeoFeatureType();
    }

    /**
     * Create an instance of {@link TariffValidation }
     * 
     */
    public TariffValidation createTariffValidation() {
        return new TariffValidation();
    }

    /**
     * Create an instance of {@link ProductStatusType }
     * 
     */
    public ProductStatusType createProductStatusType() {
        return new ProductStatusType();
    }

    /**
     * Create an instance of {@link IconType }
     * 
     */
    public IconType createIconType() {
        return new IconType();
    }

    /**
     * Create an instance of {@link RGBAColorType }
     * 
     */
    public RGBAColorType createRGBAColorType() {
        return new RGBAColorType();
    }

    /**
     * Create an instance of {@link PolylineGroup }
     * 
     */
    public PolylineGroup createPolylineGroup() {
        return new PolylineGroup();
    }

    /**
     * Create an instance of {@link PolylineDesc }
     * 
     */
    public PolylineDesc createPolylineDesc() {
        return new PolylineDesc();
    }

    /**
     * Create an instance of {@link Polyline }
     * 
     */
    public Polyline createPolyline() {
        return new Polyline();
    }

    /**
     * Create an instance of {@link CombinedProductType }
     * 
     */
    public CombinedProductType createCombinedProductType() {
        return new CombinedProductType();
    }

    /**
     * Create an instance of {@link PricingType }
     * 
     */
    public PricingType createPricingType() {
        return new PricingType();
    }

    /**
     * Create an instance of {@link EcoType }
     * 
     */
    public EcoType createEcoType() {
        return new EcoType();
    }

    /**
     * Create an instance of {@link TripStatusType }
     * 
     */
    public TripStatusType createTripStatusType() {
        return new TripStatusType();
    }

    /**
     * Create an instance of {@link FreqType }
     * 
     */
    public FreqType createFreqType() {
        return new FreqType();
    }

    /**
     * Create an instance of {@link GisRouteType }
     * 
     */
    public GisRouteType createGisRouteType() {
        return new GisRouteType();
    }

    /**
     * Create an instance of {@link GisEdgeType }
     * 
     */
    public GisEdgeType createGisEdgeType() {
        return new GisEdgeType();
    }

    /**
     * Create an instance of {@link GisRouteSegment }
     * 
     */
    public GisRouteSegment createGisRouteSegment() {
        return new GisRouteSegment();
    }

    /**
     * Create an instance of {@link TrafficMessageType }
     * 
     */
    public TrafficMessageType createTrafficMessageType() {
        return new TrafficMessageType();
    }

    /**
     * Create an instance of {@link MessageTextType }
     * 
     */
    public MessageTextType createMessageTextType() {
        return new MessageTextType();
    }

    /**
     * Create an instance of {@link MessageCategoryType }
     * 
     */
    public MessageCategoryType createMessageCategoryType() {
        return new MessageCategoryType();
    }

    /**
     * Create an instance of {@link TagsType }
     * 
     */
    public TagsType createTagsType() {
        return new TagsType();
    }

    /**
     * Create an instance of {@link AffectedStopType }
     * 
     */
    public AffectedStopType createAffectedStopType() {
        return new AffectedStopType();
    }

    /**
     * Create an instance of {@link MessageChannelType }
     * 
     */
    public MessageChannelType createMessageChannelType() {
        return new MessageChannelType();
    }

    /**
     * Create an instance of {@link MessageEdgeType }
     * 
     */
    public MessageEdgeType createMessageEdgeType() {
        return new MessageEdgeType();
    }

    /**
     * Create an instance of {@link MessageRegionType }
     * 
     */
    public MessageRegionType createMessageRegionType() {
        return new MessageRegionType();
    }

    /**
     * Create an instance of {@link MessageEventType }
     * 
     */
    public MessageEventType createMessageEventType() {
        return new MessageEventType();
    }

    /**
     * Create an instance of {@link Coordinate }
     * 
     */
    public Coordinate createCoordinate() {
        return new Coordinate();
    }

    /**
     * Create an instance of {@link Ring }
     * 
     */
    public Ring createRing() {
        return new Ring();
    }

    /**
     * Create an instance of {@link Rect }
     * 
     */
    public Rect createRect() {
        return new Rect();
    }

    /**
     * Create an instance of {@link JourneyPathType }
     * 
     */
    public JourneyPathType createJourneyPathType() {
        return new JourneyPathType();
    }

    /**
     * Create an instance of {@link JourneyPathItemType }
     * 
     */
    public JourneyPathItemType createJourneyPathItemType() {
        return new JourneyPathItemType();
    }

    /**
     * Create an instance of {@link ParallelJourneyRefType }
     * 
     */
    public ParallelJourneyRefType createParallelJourneyRefType() {
        return new ParallelJourneyRefType();
    }

    /**
     * Create an instance of {@link ResourceLinks }
     * 
     */
    public ResourceLinks createResourceLinks() {
        return new ResourceLinks();
    }

    /**
     * Create an instance of {@link ResourceLinkType }
     * 
     */
    public ResourceLinkType createResourceLinkType() {
        return new ResourceLinkType();
    }

    /**
     * Create an instance of {@link UrlLinkType }
     * 
     */
    public UrlLinkType createUrlLinkType() {
        return new UrlLinkType();
    }

    /**
     * Create an instance of {@link MatchQualityType }
     * 
     */
    public MatchQualityType createMatchQualityType() {
        return new MatchQualityType();
    }

    /**
     * Create an instance of {@link MapLayerType }
     * 
     */
    public MapLayerType createMapLayerType() {
        return new MapLayerType();
    }

    /**
     * Create an instance of {@link OccupancyType }
     * 
     */
    public OccupancyType createOccupancyType() {
        return new OccupancyType();
    }

    /**
     * Create an instance of {@link ConnectionReliabilityType }
     * 
     */
    public ConnectionReliabilityType createConnectionReliabilityType() {
        return new ConnectionReliabilityType();
    }

    /**
     * Create an instance of {@link PreselectionNodeType }
     * 
     */
    public PreselectionNodeType createPreselectionNodeType() {
        return new PreselectionNodeType();
    }

    /**
     * Create an instance of {@link PreselectionEdgeType }
     * 
     */
    public PreselectionEdgeType createPreselectionEdgeType() {
        return new PreselectionEdgeType();
    }

    /**
     * Create an instance of {@link PreselectionType }
     * 
     */
    public PreselectionType createPreselectionType() {
        return new PreselectionType();
    }

    /**
     * Create an instance of {@link PartialSearchReplacementType }
     * 
     */
    public PartialSearchReplacementType createPartialSearchReplacementType() {
        return new PartialSearchReplacementType();
    }

    /**
     * Create an instance of {@link PartialSearchSegmentType }
     * 
     */
    public PartialSearchSegmentType createPartialSearchSegmentType() {
        return new PartialSearchSegmentType();
    }

    /**
     * Create an instance of {@link PartialSearchSegmentLocation }
     * 
     */
    public PartialSearchSegmentLocation createPartialSearchSegmentLocation() {
        return new PartialSearchSegmentLocation();
    }

    /**
     * Create an instance of {@link SotContextType }
     * 
     */
    public SotContextType createSotContextType() {
        return new SotContextType();
    }

    /**
     * Create an instance of {@link ProviderType }
     * 
     */
    public ProviderType createProviderType() {
        return new ProviderType();
    }

    /**
     * Create an instance of {@link GeoDataType }
     * 
     */
    public GeoDataType createGeoDataType() {
        return new GeoDataType();
    }

    /**
     * Create an instance of {@link DateTimeIntervalType }
     * 
     */
    public DateTimeIntervalType createDateTimeIntervalType() {
        return new DateTimeIntervalType();
    }

    /**
     * Create an instance of {@link ReferencedJourneyType }
     * 
     */
    public ReferencedJourneyType createReferencedJourneyType() {
        return new ReferencedJourneyType();
    }

    /**
     * Create an instance of {@link ResultStatusType }
     * 
     */
    public ResultStatusType createResultStatusType() {
        return new ResultStatusType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopLocation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopLocation }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "StopLocation")
    public JAXBElement<StopLocation> createStopLocation(StopLocation value) {
        return new JAXBElement<StopLocation>(_StopLocation_QNAME, StopLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordLocation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CoordLocation }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "CoordLocation")
    public JAXBElement<CoordLocation> createCoordLocation(CoordLocation value) {
        return new JAXBElement<CoordLocation>(_CoordLocation_QNAME, CoordLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationNote }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocationNote }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "LocationNote")
    public JAXBElement<LocationNote> createLocationNote(LocationNote value) {
        return new JAXBElement<LocationNote>(_LocationNote_QNAME, LocationNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Arrival }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Arrival }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "Arrival")
    public JAXBElement<Arrival> createArrival(Arrival value) {
        return new JAXBElement<Arrival>(_Arrival_QNAME, Arrival.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Message }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Message }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "Message")
    public JAXBElement<Message> createMessage(Message value) {
        return new JAXBElement<Message>(_Message_QNAME, Message.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Departure }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Departure }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "Departure")
    public JAXBElement<Departure> createDeparture(Departure value) {
        return new JAXBElement<Departure>(_Departure_QNAME, Departure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JourneyDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "JourneyDetail")
    public JAXBElement<JourneyDetail> createJourneyDetail(JourneyDetail value) {
        return new JAXBElement<JourneyDetail>(_JourneyDetail_QNAME, JourneyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "JourneyStatus")
    public JAXBElement<String> createJourneyStatus(String value) {
        return new JAXBElement<String>(_JourneyStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDays }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceDays }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "ServiceDays")
    public JAXBElement<ServiceDays> createServiceDays(ServiceDays value) {
        return new JAXBElement<ServiceDays>(_ServiceDays_QNAME, ServiceDays.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripList }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "TripList")
    public JAXBElement<TripList> createTripList(TripList value) {
        return new JAXBElement<TripList>(_TripList_QNAME, TripList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripType }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "Trip")
    public JAXBElement<TripType> createTrip(TripType value) {
        return new JAXBElement<TripType>(_Trip_QNAME, TripType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Leg }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Leg }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "Leg")
    public JAXBElement<Leg> createLeg(Leg value) {
        return new JAXBElement<Leg>(_Leg_QNAME, Leg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginDestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OriginDestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "Origin")
    public JAXBElement<OriginDestType> createOrigin(OriginDestType value) {
        return new JAXBElement<OriginDestType>(_Origin_QNAME, OriginDestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginDestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OriginDestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "Destination")
    public JAXBElement<OriginDestType> createDestination(OriginDestType value) {
        return new JAXBElement<OriginDestType>(_Destination_QNAME, OriginDestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationPreselectionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocationPreselectionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "LocationPreselectionResponse")
    public JAXBElement<LocationPreselectionResponse> createLocationPreselectionResponse(LocationPreselectionResponse value) {
        return new JAXBElement<LocationPreselectionResponse>(_LocationPreselectionResponse_QNAME, LocationPreselectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReconstructionConvertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReconstructionConvertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://hacon.de/hafas/proxy/hafas-proxy", name = "ReconstructionConvertResponse")
    public JAXBElement<ReconstructionConvertResponse> createReconstructionConvertResponse(ReconstructionConvertResponse value) {
        return new JAXBElement<ReconstructionConvertResponse>(_ReconstructionConvertResponse_QNAME, ReconstructionConvertResponse.class, null, value);
    }

}
