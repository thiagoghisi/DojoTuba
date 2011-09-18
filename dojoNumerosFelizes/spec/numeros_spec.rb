require 'spec_helper'

describe Numeros do
  it "should be happy" do
    Numero.feliz?(1).should == true
    Numero.feliz?(7).should == true
    Numero.feliz?(49).should == true
  end

  it "should be sad" do
    Numero.feliz?(0).should == false
    Numero.feliz?(2).should == false
  end


  it "deve retornar o quadrado de um inteiro" do
    Numero.quadrado(0).should == 0
    Numero.quadrado(1).should == 1
    Numero.quadrado(2).should == 4
  end

  it "deve retornar o quadrado dos elementos de um inteiro" do
    Numero.calcular(10).should == 1
  end

  it "deve retornar o numero de digitos" do
    Numero.length(0).should == 1
    Numero.length(10).should == 2
    Numero.length(5000).should == 4  
  end
  
  
  

#  it "should be happy" do
#    Numero.feliz?("49").should == true
#  end
end