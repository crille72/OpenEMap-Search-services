
package net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A Surface is a 2-dimensional primitive and is composed
 *             of one or more surface patches. The surface patches are
 *             connected to one another.
 *             The orientation of the surface is positive ("up"). The
 *             orientation of a surface chooses an "up" direction
 *             through the choice of the upward normal, which, if the
 *             surface is not a cycle, is the side of the surface from
 *             which the exterior boundary appears counterclockwise.
 *             Reversal of the surface orientation reverses the curve
 *             orientation of each boundary component, and interchanges
 *             the conceptual "up" and "down" direction of the surface.
 *             If the surface is the boundary of a solid, the "up"
 *             direction is usually outward. For closed surfaces, which
 *             have no boundary, the up direction is that of the surface
 *             patches, which must be consistent with one another. Its
 *             included surface patches describe the interior structure
 *             of the Surface.
 *          
 * 
 * <p>Java class for SurfaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml}AbstractSurfaceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml}patches"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceType", propOrder = {
    "patches"
})
public class SurfaceType
    extends AbstractSurfaceType
{

    @XmlElement(required = true)
    protected SurfacePatchArrayPropertyType patches;

    /**
     * 
     *                         This element encapsulates the patches of the
     *                         surface.
     *                      
     * 
     * @return
     *     possible object is
     *     {@link SurfacePatchArrayPropertyType }
     *     
     */
    public SurfacePatchArrayPropertyType getPatches() {
        return patches;
    }

    /**
     * Sets the value of the patches property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePatchArrayPropertyType }
     *     
     */
    public void setPatches(SurfacePatchArrayPropertyType value) {
        this.patches = value;
    }

    public boolean isSetPatches() {
        return (this.patches!= null);
    }

}
