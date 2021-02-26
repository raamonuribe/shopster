import { Fragment, useState, useEffect } from 'react';
import { Col, Row } from 'react-bootstrap';
import Product from '../components/Product';
import axios from 'axios';

const HomeScreen = () => {
   const [products, setProducts] = useState([]);
   useEffect(() => {
      const fetchProducts = async () => {
         const response = await axios.get('http://localhost:8080/api/products');
         setProducts(response.data);
      };
      fetchProducts();
   }, []);
   const renderedProducts = products.map((product) => {
      return (
         <Col key={product.id} sm={12} md={6} lg={4} xl={3}>
            <Product product={product} />
         </Col>
      );
   });

   return (
      <Fragment>
         <h1>Latest Products</h1>
         <Row>{renderedProducts}</Row>
      </Fragment>
   );
};

export default HomeScreen;
