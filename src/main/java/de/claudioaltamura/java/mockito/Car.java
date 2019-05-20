package de.claudioaltamura.java.mockito;

import java.util.Objects;

public class Car {

  private String manuefactor;
  private String model;
  private int wheels;

  public String getManuefactor() {
    return manuefactor;
  }

  public void setManuefactor(String manuefactor) {
    this.manuefactor = manuefactor;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  @Override
  public int hashCode() {
    return Objects.hash(manuefactor, model, wheels);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Car other = (Car) obj;
    return Objects.equals(manuefactor, other.manuefactor) && Objects.equals(model, other.model)
        && wheels == other.wheels;
  }

  @Override
  public String toString() {
    return "Car [manuefactor=" + manuefactor + ", model=" + model + ", wheels=" + wheels + "]";
  }

}
